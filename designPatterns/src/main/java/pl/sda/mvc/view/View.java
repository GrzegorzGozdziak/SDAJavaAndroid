package pl.sda.mvc.view;

import pl.sda.mvc.controller.Controller;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Integer choice = scanner.nextInt();
            Controller controller = new Controller();

            if (choice != null && choice > 0) {
                int result = controller.getFibValue(choice);
                System.out.println("FIBONACCI = " + result);
            } else {
                System.out.println("AVG = " + controller.average());
            }
        }
    }
}
