package ch.teko.prg.tag06.W0rk;

public class main
{
    public static void main(String[] args)
    {
        Lehrling L1 = new Lehrling ("Müller","Peter",20,1000,5,123);

        System.out.println("Hallo " + L1.getVorname() + " " + "deine MitarbeiterID ist " + L1.getMitarbeiterID());

    }
}

