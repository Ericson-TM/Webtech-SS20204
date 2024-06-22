package webtechBackend.webtechprojekt.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Trainingsplan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String zeit;
    private String dauer;
    private int intensivitaet;

    public Trainingsplan(int id, String name, String zeit, String dauer, int intensivitaet){
        this.id = id;
        this.name = name;
        this.zeit = zeit;
        this.dauer = dauer;
        this.intensivitaet = intensivitaet;
    }


}
