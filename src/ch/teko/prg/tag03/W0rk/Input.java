package ch.teko.prg.tag03.W0rk;

import java.util.Scanner;

public class Input {

    private int wert1;
    private int wert2;

public Input(){
    this.wert1=0;
    this.wert2=0;
}

    public int input1() {
        Scanner Input = new Scanner(System.in);
        System.out.println("\nEnter Wert1: ");
        wert1 = Input.nextInt();
        return wert1;
    }

    public int input2() {
        Scanner Input = new Scanner (System.in);
        System.out.println ("\nEnter Wert2: ");
        wert2 = Input.nextInt();
        return wert2;
    }

    public void setWert1(int wert1) {
        this.wert1 = wert1;
    }

    public void setWert2(int wert2) {
        this.wert2 = wert2;
    }

    public int getWert1() {
        return wert1;
    }

    public int getWert2() {
        return wert2;
    }
}
