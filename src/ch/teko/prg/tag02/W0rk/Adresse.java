package ch.teko.prg.tag02.W0rk;

public class Adresse {
    private String strasse;
    private int nummer;
    private int plz;
    private String wohnort;


    public Adresse(String strasse, int nummer, int plz, String wohnort){
        this.strasse=strasse;
        this.nummer=nummer;
        this.plz=plz;
        this.wohnort=wohnort;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) { this.strasse = strasse;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }
}
