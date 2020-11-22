package ch.teko.prg.tag03.W0rk;

public class Calculate {
    private int wert1;
    private int wert2;
    private int summe;

    public Calculate(int wert1, int wert2){
        this.wert1=wert1;
        this.wert2=wert2;
    }
    public int sum(){
        summe = wert1 + wert2;
        return summe;
    }

    public int getSumme() {
        return summe;
    }
}
