package ch.teko.prg.tag02.W0rk;

public class Book {
    //Attribute
    private String titel;
    private String autor;
    private Double preis;
    private int buydate;
    private float test;

    //Konstruktor
    public Book(String titel, String autor) {
        this.titel=titel;
        this.autor=autor;
        this.preis=0.0;
        this.buydate=-1;


    }

    public Book(String titel, String autor, double preis, int buydate) {
        this.titel=titel;
        this.autor=autor;
        this.preis=preis;
        this.buydate=buydate;
    }

    //Methoden

    public String getTitel(){
        return titel;
    }

    public String getAutor(){
        return autor;
    }

    public Double getPreis(){
        return preis;
    }

    public void setPreis(double preis){
        this.preis=preis;
    }

    public int getBuydate(){
        return buydate;
    }

    public void setBuydate(int buydate) {
        this.buydate = buydate;
    }
}


