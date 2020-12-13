package ch.teko.prg.pruf.ue5;

public class Triangle
{
    private String color;
    private double xPosition;
    private double yPosition;
    private double lengthA;
    private double lengthB;
    private double lengthC;

    public Triangle (String color, double xPosition, double yPosition, double lengthA, double lengthB, double lengthC)
    {
        this.color=color;
        this.xPosition=xPosition;
        this.yPosition=yPosition;
        this.lengthA=lengthA;
        this.lengthB=lengthB;
        this.lengthC=lengthC;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getFlaeche(){
        double s = (lengthA+lengthB+lengthC)/2;
        double flaeche=Math.sqrt(s*(s-lengthA)*(s-lengthB)*(s-lengthC));
        return flaeche;
    }
}