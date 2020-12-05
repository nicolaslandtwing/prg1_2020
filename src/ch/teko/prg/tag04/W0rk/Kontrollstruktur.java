package ch.teko.prg.tag04.W0rk;

import java.sql.SQLOutput;

public class Kontrollstruktur {

    private String name;
    private Double version;

    public Kontrollstruktur(String name, Double version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    public double calculatePrice(int alter) {
        double preis;
        if (alter < 6) {
            preis = 0;
        } else if (alter >= 6 && alter < 12) {
            preis = 5.0;
        } else if (alter >= 12 && alter < 18) {
            preis = 10.0;
        } else {
            preis = 15;
            if (alter >= 65) {
                preis = preis / 2;
            }
        }
        return preis;
    }

    public void testEvaluation(int Punkte) {
        if (Punkte >= 0) {
            switch (Punkte) {
                case 10:
                    System.out.println("Ergebnis: Sehr gut");
                    break;
                case 9:
                    System.out.println("Ergebnis: Gut");
                    break;
                case 8:
                    System.out.println("Ergebnis: Befriedigend");
                    break;
                case 7:
                    System.out.println("Ergebnis: Ausreichend");
                    break;
                default:
                    System.out.println("Ergebnis: Leider nicht genuegend Punkte erreicht");
            }
        } else {
            System.out.println("Negative Punkte sind nicht erlaubt!");
        }
    }

    public void counter() {
        int count = 10;

        while (count >= 7) {
            System.out.println(count);
            count = count - 1;
        }
        System.out.println("...");
    }
}

