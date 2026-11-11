package project7;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("روز را وارد کن");
        String input= reader.nextLine();
        int days = toInteger(input);
        LocalDate now = LocalDate.now();
        LocalDate end = now.plusDays(days);
        Period period = Period.between(now,end);
        System.out.println("روز : "+period.getDays());
        System.out.println("ماه : "+period.getMonths());
        System.out.println("سال : "+period.getYears());

    }
    public static int toInteger(String input) {
        Scanner reader = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\s*\\d{1,6}\\s*");
        String patternError = "شما تنها می توانید عدد صحیح شش رقمی را به کار ببرید." ;
        int output = 0;
        while (true) {
            if (input.matches(pattern.pattern())) {
                output = Integer.parseInt(input.trim() );
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
