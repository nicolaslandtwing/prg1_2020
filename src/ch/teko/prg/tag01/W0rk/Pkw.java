package ch.teko.prg.tag01.W0rk;

public class Pkw{
    //Instanzvariabeln (Variablen)

    private String marke;
    private String modell;
    private int ps;

    //Konstruktor
    public Pkw(String marke, String modell, int ps) {
        this.marke  = marke;
        this.modell = modell;
        this.ps     = ps;

    }

    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }

    public void getPs() {
        this.ps = ps;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setps(int ps){
        this.ps = ps;
    }

}
