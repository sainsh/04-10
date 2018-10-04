package classroom;


import javafx.scene.paint.Color;

public class Hund {

    // 1. Member variable, class variable, klassse variabler, data member
    private int antalBen = 4;
    private String navn = "";
    private String race = "";
    private double stoerrelseKilogram = 0;
    private Color farve = Color.BEIGE;
    private int alder = 0;

    //2. Constructor, Konstruktør
    public Hund() {
        System.out.println("Et nyt hundeobjekt er oprettet.");
    }

    //3. Methods, Metoder, functions
    public void spis() {

    }

    public void loeb() {

    }

    public void goe() {
        System.out.println("bork bork");
    }

    public void sidde() {

    }

    public int getAntalBen() {
        return antalBen;
    }

    public void setAntalBen(int antalBen) {
        this.antalBen = antalBen;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public double getStoerrelseKilogram() {
        return stoerrelseKilogram;
    }

    public void setStoerrelseKilogram(double stoerrelseKilogram) {
        this.stoerrelseKilogram = stoerrelseKilogram;
    }

    public Color getFarve() {
        return farve;
    }

    public void setFarve(Color farve) {
        this.farve = farve;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }
}
