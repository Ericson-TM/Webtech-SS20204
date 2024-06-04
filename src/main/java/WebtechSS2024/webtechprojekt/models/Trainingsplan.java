package WebtechSS2024.webtechprojekt.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Trainingsplan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String zielZeit;

    private String dauerMonate;

    private int trainingstage;

    private int intensivität;

    public Trainingsplan(String name, String zielZeit, String dauerMonate, int trainingstage, int intensivität){
        this.name = name;
        this.zielZeit = zielZeit;
        this.dauerMonate = dauerMonate;
        this.trainingstage = trainingstage;
        this.intensivität = intensivität;
    }


}
