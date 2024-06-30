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
