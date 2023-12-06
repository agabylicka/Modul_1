
package HelloWorld;

import java.util.Scanner;


public class Scanners {
    
    
    
    public void createCarFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give weight of Your car:");
        String input = scanner.nextLine();
        Integer weight = Integer.parseInt(input, 0, 0, 0);
        System.out.println("Weight Your car: " + weight);
        //int weight = scanner.nextInt();
        System.out.println("Give manufacturer of Your car:");
        String manufacturer = scanner.nextLine();
        System.out.println("Manufacturer Your car: " + manufacturer);
        System.out.println("Give model of Your car:");
        String model = scanner.nextLine();
        System.out.println("Model Your car: " + model);
        Car four = new Car(weight, manufacturer, model);
        four.print();
    }
}
