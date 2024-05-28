package WebtechSS2024.webtechprojekt.models;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Trainingsplan {

    private int id;

    private String art;

    private String zielZeit;

    private String dauerMonate;

    private int trainingstage;

    private int intensivität;

    public Trainingsplan(String art, String zielZeit, String dauerMonate, int trainingstage, int intensivität){
        this.art = art;
        this.zielZeit = zielZeit;
        this.dauerMonate = dauerMonate;
        this.trainingstage = trainingstage;
        this.intensivität = intensivität;
    }


}
