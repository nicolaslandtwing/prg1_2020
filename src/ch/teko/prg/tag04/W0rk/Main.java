package ch.teko.prg.tag04.W0rk;

public class Main {
    public static void main(String[] args) {
        //Aufgabe 1
        Kontrollstruktur Preisberechnen = new Kontrollstruktur("Preisberechnen", 1.0);
        //Aufgabe 2
        Kontrollstruktur Evaluation = new Kontrollstruktur("Evaluation", 1.0);
        //Aufgabe 3
        Kontrollstruktur Counter = new Kontrollstruktur("counter", 1.0);


    //Aufgabe 1
        System.out.println("Eintrittspreis Kind: " + Preisberechnen.calculatePrice(5) + "CHF");
        System.out.println("Eintrittspreis Schueler: " + Preisberechnen.calculatePrice(6) + "CHF");
        System.out.println("Eintrittspreis Jugendliche: " + Preisberechnen.calculatePrice(17) + "CHF");
        System.out.println("Eintrittspreis Erwachsene: " + Preisberechnen.calculatePrice(18) + "CHF");
        System.out.println("Eintrittspreis Renter (50%): " + Preisberechnen.calculatePrice(1523) + "CHF");

    //Aufgabe 2
     Evaluation.testEvaluation(0);

     //Aufgabe 3
     Counter.counter();


     //OOP_04_02
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


       for (int start = 0; start < 2; start++) {
            for(int x=0; x<1;x++) {
                System.out.printf("*");
            }
            System.out.println();
            for(int y=0; y<2;y++) {
                System.out.printf("*");
            }
            System.out.println();
            for(int z=0; z<3;z++) {
                System.out.printf("*");
            }
            System.out.println();
            for(int a=0; a<4;a++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}



