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
    private String zielZeit;
    private String dauerMonate;
    private int intensivitaet;

    public Trainingsplan(String name, String zielZeit, String dauerMonate, int intensivitaet){
        this.name = name;
        this.zielZeit = zielZeit;
        this.dauerMonate = dauerMonate;
        this.intensivitaet = intensivitaet;
    }


}
