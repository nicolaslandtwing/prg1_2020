package ch.teko.prg.tag05.W0rk;

import java.lang.Math;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        Double[] Array;
        Array = new Double[5];
        String[] Name = {"Baloon1", "Baloon2", "Baloon3", "Baloon4", "Baloon5"}

        for (int counter = 0; counter < Array.length; counter++)
        {
            ;
            Baloon Name[counter] = new Baloon("grün", Array[counter] = Math.random());
            System.out.println("Balloon on Array Positon " + counter + " has Size " + Name[counter].getSize());
        }

            for (int counter = 0; counter < Array.length; counter++)
            {
                Name[counter].blowUp(50.0);
                System.out.println(Name[counter].getSize());
            }

            for (int counter = 0; counter < Array.length && Name[counter].getSize()!= 0; counter++){
                System.out.println("Balloon on Array Positon " + counter + " has Size " + Name[counter].getSize());
        }

       for (int counter = 0; counter < Array.length; counter++) {
            System.out.println("Balloon on Array Positon " + counter + " has Size" + Name[counter].getSize());
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
