package excercise3;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value(Electricity KWH)...");
        float input = scanner.nextFloat();
        if (0 <= input && input <= 100) {
            System.out.println("Your Price : " + input * 100 + " Toman");
        } else if (100 < input && input <= 300) {
            System.out.println("Your Price : " + input * 200 + " Toman");
        } else if (300 < input) {
            System.out.println("Your Price : " + input * 400 + " Toman");
        }
    }
}
