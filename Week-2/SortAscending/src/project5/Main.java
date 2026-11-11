package project5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
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
            float temp;
            if (num2 > num1) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }                       //temp       16      16
            if (num3 > num2) {         //num1  16    18        18
                temp = num2;          //num2  18     16      20
                num2 = num3;          //num3 20       20       16
                num3 = temp;
            }
            if (num2 > num1) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }

            System.out.println("---------------------------");
            System.out.println("num1 : " + num1);
            System.out.println("num2 : " + num2);
            System.out.println("num3 : " + num3);
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

