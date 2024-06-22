package webtechBackend.webtechprojekt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webtechBackend.webtechprojekt.models.User;
import webtechBackend.webtechprojekt.persistence.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user){
        // Zusätzliche Validierung möglich
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
