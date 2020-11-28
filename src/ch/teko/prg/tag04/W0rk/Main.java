package ch.teko.prg.tag04.W0rk;

public class Main {
    public static void main(String[] args) {
        Kontrollstruktur Preisberechnen = new Kontrollstruktur("Preisberechnen", 1.0);
        Kontrollstruktur Evaluation = new Kontrollstruktur("Evaluation", 1.0);
        Kontrollstruktur Counter = new Kontrollstruktur("counter", 1.0);

    /*
        System.out.println("Eintrittspreis Kind: " + Preisberechnen.calculatePrice(5) + "CHF");
        System.out.println("Eintrittspreis Schueler: " + Preisberechnen.calculatePrice(6) + "CHF");
        System.out.println("Eintrittspreis Jugendliche: " + Preisberechnen.calculatePrice(17) + "CHF");
        System.out.println("Eintrittspreis Erwachsene: " + Preisberechnen.calculatePrice(18) + "CHF");
        System.out.println("Eintrittspreis Renter (50%): " + Preisberechnen.calculatePrice(1523) + "CHF");

     Evaluation.testEvaluation(0);


    Counter.counter();


        System.out.println("erste for Schleife:");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.print(" " + i);
        }

        System.out.println(); // Zeilenumbruch

        System.out.println("zweite for Schleife:");
        for (int i = 1; i <= 10; i = i + 2) {
            System.out.print(" " + i);
        }

        System.out.println(); // Zeilenumbruch

        System.out.println("dritte for Schleife:");
        for (int i = 1; i <= 10; i = i * 2) {
            System.out.print(" " + i);
        }

        System.out.println(); // Zeilenumbruch
*/

        for (int x = 0; x < 9; x++) {
            for(x=0; x<1;x++) {
                System.out.println("*");
            }
            for(x=0; x<2;x++) {
                System.out.println("*");
            }
            for(x=0; x<3;x++) {
                System.out.println("*");
            }
            for(x=0; x<4;x++) {
                System.out.println("*");
            }
        }
    }
}



