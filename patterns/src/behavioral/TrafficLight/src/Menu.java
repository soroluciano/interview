package behavioral.TrafficLight.src;

import java.util.Scanner;

public class Menu {
    TrafficLight trafficLight;

    public Menu(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        char opcion;
        String optionMessage = "Select action: " +
                "a) what color is now, x) exit";

        while (true) {
            System.out.println(optionMessage);
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'a': trafficLight.whatColorIs(); break;
                case 'x': System.out.println("Good Bye!"); System.exit(0);
                default: System.out.println("Not valid Option");
            }
        }
    }
}