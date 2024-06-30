package webtechBackend.webtechprojekt.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.*;
import webtechBackend.webtechprojekt.models.User;
import webtechBackend.webtechprojekt.persistence.UserRepository;
import webtechBackend.webtechprojekt.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<User>> getUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }


    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user){

        User existingUser = userRepository.findByUsername(user.getUsername());
        if (existingUser != null){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashedPassword);
        userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestBody User user){
        User storedUser = userRepository.findByUsername(user.getUsername());
        if (storedUser != null && BCrypt.checkpw(user.getPassword(), storedUser.getPassword())){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        } else {
            return ResponseEntity.ok(storedUser);
        }
    }


}
