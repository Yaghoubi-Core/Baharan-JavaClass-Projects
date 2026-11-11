package project7;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("روز را وارد کن");
        int days = reader.nextInt();
        LocalDate now = LocalDate.now();
        LocalDate end = now.plusDays(days);
        Period period = Period.between(now,end);
        System.out.println("روز : "+period.getDays());
        System.out.println("ماه : "+period.getMonths());
        System.out.println("سال : "+period.getYears());

    }
}
