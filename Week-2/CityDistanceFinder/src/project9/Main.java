package project9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter the first distance...");
        int distance1 = reader.nextInt();
        System.out.println("enter the second distance...");
        int distance2 = reader.nextInt();
        System.out.println("enter the third distance...");
        int distance3 = reader.nextInt();
        int most=0;
        int lest=0;
        if (distance1 > distance2 && distance1 > distance3) {
            most = distance1;
        } else if (distance2 > distance1 && distance2 > distance3) {
            most = distance2;
        } else if (distance3 > distance1 && distance3 > distance2) {
            most = distance3;
        }
        if (distance1 < distance2 && distance1 < distance3) {
            lest = distance1;
        } else if (distance2 < distance1 && distance2 < distance3) {
            lest = distance2;
        } else if (distance3 < distance1 && distance3 < distance2) {
            lest = distance3;
        }
        System.out.printf("The most distance is %s And The lest distance is %s",most,lest);
    }
}