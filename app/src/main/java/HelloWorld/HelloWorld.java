
package HelloWorld;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String imie = "Agnieszka";
        String nazwisko = "Trzcinska";
        String miasto = "Wroclaw";
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(miasto);
        System.out.println("Hello World!");
        
        Car one = new Car(1500, "Opel", "Astra");
        Car two = new Car(1600, "Mini", "Cooper");
        Car three = new Car(1700, "Skoda", "Fabia");
        one.print();
        two.print();
        three.print();
        
        //Scanners scanner = new Scanners(System.in);
        
        Scanner first = new Scanner(System.in);
        //first.print();
       
    }
}


//TODO coś tu mi sie nie kompiluje
