package ch.teko.prg.tag03.W0rk;

import org.w3c.dom.css.Rect;

public class Main {

    public static void main(String[] args) {
        /*Rectangle quadrat = new Rectangle("Quadrat",2, 2);

        quadrat.returnFlaeche();

        quadrat.setBreite(3.4);
        quadrat.setLaenge(2.7);
        System.out.println(quadrat.getFlaeche());
    */

    Input Meinezahlen = new Input();
    Meinezahlen.setWert1(Meinezahlen.input());
    Meinezahlen.setWert2(Meinezahlen.input());
    Calculate Rechnung1 = new Calculate (Meinezahlen.getWert1(), Meinezahlen.getWert2());
    Rechnung1.sum();
    System.out.println("Resultat: " + Rechnung1.getSumme());
    }

}
