package ch.teko.prg.tag01.W0rk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pkw pkw1 = new Pkw("Wartburg", "353", 50);
        Pkw pkw2 = new Pkw("VW", "Lupo", 50);
        Pkw pkw3 = new Pkw("Chevrolet", "Belair", 250);
        System.out.println("PKW1:");
        System.out.println(pkw1.getMarke());
        //System.out.println("PKW2:",pkw2.getMarke());
        //System.out.println("PKW3:",pkw3.getMarke());

        /*Testen der Klasse Scanner
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nEnter username: ");
        String userName = myObj.nextLine();
        System.out.println("USername is: " + userName);
        */

    }


}