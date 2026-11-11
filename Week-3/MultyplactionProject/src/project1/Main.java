package project1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("Enter your number : ");
            int num = toInteger(reader.nextLine());
            System.out.println("result");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + i * num);
            }
            System.out.println("For exit print 0");
            if (reader.nextLine().trim().equals("0")) {
                break;
            }
            System.err.println("-----------Start Again-----------");
        } while (true);
    }

    public static int toInteger(String input) {
        Scanner reader = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\s*\\d{1,6}\\s*");
        String patternError = "شما تنها می توانید عدد صحیح شش رقمی را به کار ببرید.";
        int output = 0;
        while (true) {
            if (input.matches(pattern.pattern())) {
                output = Integer.parseInt(input.trim());
                break;
            } else {
                System.err.println("------------------------" + patternError + "------------------------");
                System.out.println("عدد را مجددا وارد بفرمایید");
                input = reader.nextLine();
            }
        }
        return output;

    }
}
