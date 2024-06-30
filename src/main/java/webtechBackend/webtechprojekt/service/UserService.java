package webtechBackend.webtechprojekt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import webtechBackend.webtechprojekt.models.User;
import webtechBackend.webtechprojekt.persistence.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Möglichkeit alle User auszugeben
    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }

    public User registerUser(User user){

        // Passwort wird gehasht
        String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashedPassword);

        // Überprüft ob Username bereits vergeben ist und gibt Fehlermeldung zurück
        if (userRepository.findByUsername(user.getUsername()) != null){
            throw new RuntimeException("Username bereits vergeben");
        }

        return userRepository.save(user);
    }


    public User loginUser(String username, String password){
        // Zusätzliche Validierung möglich
        User user = userRepository.findByUsername(username);
        if(user != null && user.getPassword().equals(password)){
            return user;
        }
        return null; // Login fehlgeschlagen
    }



}
