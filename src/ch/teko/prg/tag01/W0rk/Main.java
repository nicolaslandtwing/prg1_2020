package ch.teko.prg.tag01.W0rk;

import java.util.Scanner;

public class Main {
    public static void Pkw(String[] args) {
        PWK pkw1 = new PWK("Wartburg", "353", 50);
        PWK pkw2 = new PWK("VW", "Lupo", 50);
        PWK pkw3 = new PWK("Chevrolet", "Belair", 250);
        System.out.println("PKW1:", pkw1.getmarke());
        System.out.println("PKW2:", pkw2.getmarke());
        System.out.println("PKW3:", pkw3.getmarke());

    }

}