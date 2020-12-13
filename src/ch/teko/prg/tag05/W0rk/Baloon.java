package ch.teko.prg.tag05.W0rk;

public class Baloon {
    private String color;
    private double size;

    public Baloon(String color, double size){
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double blowUp (double size){
        if (getSize()+size > 100.0){
            this.size=0;
        }
        else {
            this.size = getSize()+size;
            return getSize();
        }
        return size;
    }
}
