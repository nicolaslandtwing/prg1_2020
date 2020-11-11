package ch.teko.prg.tag01.W0rk;

import java.util.Scanner;

public class username {

    public static void main(String[] args) {
        Scanner myObj = new Scanner (System.in);
        System.out.println("Enter Username: ");
        String userName=myObj.nextLine ();
        System.out.println ("Username ist: " + userName);

    }

}