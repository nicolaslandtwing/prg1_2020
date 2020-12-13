package ch.teko.prg.pruf.ue5;
import java.util.Scanner;
public class Main {

 //Aufgabe 7 b
 /*   int a = 10;

	do {                              //Start der Schleife mit do
        a = a -1;
        while (a > 0);            //irgend eine Anweisung
    }  */                           //Schleife wird wiederholt bis a nicht mehr grösser 0 ist







 public static void main(String[] args) {

//Aufgabe 7 c
    int i=0;
	while(i<10){
	    System.out.println(i*i);
	    i+=2;
    }
	/*
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int divisor = 2;
        int number;
        number = scanner.nextInt();
        if ((number > 0) && (number > divisor)) {
            result = number % divisor;
            switch (result) {
                case 0:
                    System.out.println("Durch 2 teilbar");
                    break;
                case 1:
                    System.out.println("Nicht durch 2 teilbar");
                    break;
            }
        } else {
            System.out.println("Input Number not valid");
        }

	 */
    }

}


