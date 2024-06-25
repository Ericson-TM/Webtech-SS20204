package webtechBackend.webtechprojekt.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


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

    public User(int id, String username, String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User() {}

}
