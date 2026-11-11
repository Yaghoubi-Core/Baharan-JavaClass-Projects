package project8;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("--------------First Date---------------");
        System.out.println("years: ");
        int year1 = reader.nextInt();
        System.out.println("month: ");
        int month1 = reader.nextInt();
        System.out.println("days: ");
        int day1 = reader.nextInt();
        System.out.println("--------------First Date---------------");
        System.out.println("years: ");
        int year2 = reader.nextInt();
        System.out.println("month: ");
        int month2 = reader.nextInt();
        System.out.println("days: ");
        int day2 = reader.nextInt();
        LocalDate startDate = LocalDate.of(year1,month1,day1);
        LocalDate endDate = LocalDate.of(year2,month2,day2);
        long days =ChronoUnit.DAYS.between(startDate,endDate);
        System.out.println("The Days between these to dates : "+Math.abs(days));
    }
}