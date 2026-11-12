package excercise2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static void main() {

        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("Print the first num...");
            String input1 = reader.nextLine();
            float num1 = toFloat(input1);
            System.out.println("Print the second num...");
            String input2 = reader.nextLine();
            float num2 = toFloat(input2);
            System.out.println("Print the third num...");
            String input3 = reader.nextLine();
            float num3 = toFloat(input3);
            float biggestNumber = 0.0F;

            if (num1 > num2 && num1 > num3) {
                System.out.println("num1 is the biggest");
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("num2 is the biggest");

            } else if (num3 > num1 && num3 > num2) {
                System.out.println("num3 is the biggest");
            } else if (num1 == num2 && num2 == num3) {
                System.out.println("All the three is the biggest");
            } else if (num1 == num2) {
                System.out.println("num1 == num2 is the biggest");
            } else if (num2 == num3) {
                System.out.println("num2 == num3 is the biggest");
            } else if (num3 == num1) {
                System.out.println("num3 == num1 is the biggest");
            }

            System.out.println("---------------------------");

            System.out.println("برای خروج کلید 0 را فشار دهید \n در غیر اینصورت اینتر را فشار دهید");

            if (reader.nextLine().trim().equals("0")) {
                System.exit(0);
            }
            System.out.println("---------------------------");
        } while (true);
    }

    public static float toFloat(String input) {
        Scanner reader = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^(\\s*\\d{1,3})(\\.\\d{1,3}\\s*)?$");
        String patternError = "شما تنها می توانید عدد صحیح سه رقمی یا عدد اعشاری با سه رقم و صحیح  و سه رقم اعشار استفاده کنید.";
        float output = 0.0F;
        while (true) {
            if (input.matches(pattern.pattern())) {
                output = Float.parseFloat(input);
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
