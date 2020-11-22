package ch.teko.prg.tag03.W0rk;

import java.util.Scanner;

public class Input {

    public static int wert1;
    public static int wert2;



    public static void input() {
        Scanner Input = new Scanner(System.in);
        System.out.println("\nEnter Wert1: ");
        wert1 = Input.nextInt();
        System.out.println("\nEnter Wert2");
        wert2 = Input.nextInt();
    }

}
