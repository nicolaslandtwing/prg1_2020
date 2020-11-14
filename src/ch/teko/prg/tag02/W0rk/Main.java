package ch.teko.prg.tag02.W0rk;

public class Main {

    public static void main(String[] args) {
        Book buch1 = new Book("Titanic", "Davies");


        System.out.println("Buch1:");
        System.out.println(buch1.getTitel());
        System.out.println(buch1.getAutor());
        System.out.println(buch1.getPreis());


        Book buch2 = new Book("CentralPark", "Musso", 22.50, 101090);
        //settermethode
        buch2.setPreis(30);

        System.out.println("Buch2:");
        System.out.println(buch2.getTitel());
        System.out.println(buch2.getAutor());
        System.out.println(buch2.getPreis());
        System.out.println(buch2.getBuydate());
    }
}
