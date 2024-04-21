package WebtechSS2024.webtechprojekt.models;


public class Trainingsplan {


    private String zielZeit;

    private String dauerMonate;

    private int trainingstage;

    private int intensivität;

    public Trainingsplan(String zielZeit, String dauerMonate, int trainingstage, int intensivität){
        this.zielZeit = zielZeit;
        this.dauerMonate = dauerMonate;
        this.trainingstage = trainingstage;
        this.intensivität = intensivität;
    }

    public String getZielZeit() {
        return zielZeit;
    }

    public void setZielZeit(String zielZeit) {
        this.zielZeit = zielZeit;
    }

    public String getDauerMonate() {
        return dauerMonate;
    }

    public void setDauerMonate(String dauerMonate) {
        this.dauerMonate = dauerMonate;
    }

    public int getTrainingstage() {
        return trainingstage;
    }

    public void setTrainingstage(int trainingstage) {
        this.trainingstage = trainingstage;
    }

    public int getIntensivität() {
        return intensivität;
    }

    public void setIntensivität(int intensivität) {
        this.intensivität = intensivität;
    }
}
