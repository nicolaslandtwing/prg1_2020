package ch.teko.prg.tag03.W0rk;

public class Rectangle {

    private String name;
    private double xPosition;
    private double yPosition;
    private double laenge;
    private double  breite;

    public Rectangle(String name,double xPosition,double yPosition,double laenge,double breite) {
        this.name=name;
        this.xPosition=xPosition;
        this.yPosition=yPosition;
        this.laenge=laenge;
        this.breite=breite;
    }
    public Rectangle(String name,double xPosition,double yPosition) {
        this.name=name;
        this.xPosition=xPosition;
        this.yPosition=yPosition;
        this.laenge=1.0;
        this.breite=1.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getxPosition() {
        return xPosition;
    }

    public void setxPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    public double getyPosition() {
        return yPosition;
    }

    public void setyPosition(double yPosition) {
        this.yPosition = yPosition;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getFlaeche (){
        double flaeche = breite * laenge;
        return flaeche;
    }
    public void returnFlaeche(){
        double flaeche = breite * laenge;
        System.out.println(flaeche);
    }

}
