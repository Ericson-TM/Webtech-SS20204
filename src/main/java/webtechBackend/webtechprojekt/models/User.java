package webtechBackend.webtechprojekt.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


/**
 * User Model
 * @Param: id, username, password
 *
 */
@Entity(name = "users")
@Getter
@Setter

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String username;
    private String password;


    public User() {}


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
