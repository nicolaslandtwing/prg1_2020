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

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    public double calculatePrice(int Alter) {
        double Preis;
        if (Alter < 6) {
            Preis = 0;
        } else if (Alter >= 6 && Alter < 12) {
            Preis = 5.0;
        } else if (Alter >= 12 && Alter < 18) {
            Preis = 10.0;
        } else {
            Preis = 15;
            if (Alter >= 65) {
                Preis = Preis / 2;
            }
        }
        return Preis;
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

