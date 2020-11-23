package ch.teko.prg.tag03.W0rk;

import java.util.Scanner;

public class Input {

    private int wert1;
    private int wert2;

public Input(){
    this.wert1=0;
    this.wert2=0;
}

    public int input() {
        int wert;
        Scanner Input = new Scanner(System.in);
        System.out.println("\nGeben Sie einen Wert ein: ");
        wert = Input.nextInt();
        return wert;
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
