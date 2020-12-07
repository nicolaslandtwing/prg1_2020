package ch.teko.prg.tag05.W0rk;

import ch.teko.prg.tag05.solution.Balloon;

import java.lang.Math;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        //Aufgabe 3
        Balloon[] b = new Balloon[5];

        for (int counter = 0; counter < b.length; counter++)
        {
            b[counter] = new Balloon("grün", (int)(Math.random()*100));
            System.out.println("Balloon on Array Positon " + counter + " has Size " + b[counter].getSize());
        }

            for (int counter = 0; counter < b.length; counter++)
            {
                b[counter].blowUp(50.0);
                System.out.println(b[counter].getSize());
            }

            for (int counter = 0; counter < b.length && b[counter].getSize()!= 0; counter++){
                System.out.println("Balloon on Array Positon " + counter + " has Size " + b[counter].getSize());
        }

       for (int counter = 0; counter < b.length; counter++) {
           if (b[counter].getSize() > 0)
           System.out.println("Balloon on Array Positon " + counter + " has Size" + b[counter].getSize());
        }



     //Aufgabe 4:
        double [] squares = {0,1,2,3,4,5,6,7,8,9};
            for (int zahler = 0; zahler < squares.length; zahler++){
                squares[zahler] = squares[zahler]* squares[zahler];
            }
            for (int zahler = 0; zahler < squares.length; zahler++){
                System.out.println("Das Quadrat von " + zahler + " ist " + squares[zahler]);
            }
        Arrays.fill (squares, 1.0);
        System.out.println(squares [5]);
    }
}
