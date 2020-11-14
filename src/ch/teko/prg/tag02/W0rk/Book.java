package ch.teko.prg.tag02.W0rk;

public class Book {
    //Attribute
    private String titel;
    private String autor;
    private Double preis;
    private int buydate;

    //Konstruktor
    public Book(String titel, String autor) {
        this.titel=titel;
        this.autor=autor;
        this.preis=0.0;
        this.buydate=1;
    }

    public Book(String titel, String autor, double preis, int buydate) {
        this.titel=titel;
        this.autor=autor;
        this.preis=preis;
        this.buydate=buydate;
    }

    //Methoden

    public String getTitel(){
        this.titel=titel;
        return titel;
    }

    public String getAutor(){
        this.autor=autor;
        return autor;
    }

    public Double getPreis(){
        this.preis=preis;
        return preis;
    }

    public void setPreis(double preis){
        this.preis=preis;
    }

    public int getBuydate(){
        this.buydate=buydate;
        return buydate;
    }

    public void setBuydate(int buydate) {
        this.buydate = buydate;
    }
}


