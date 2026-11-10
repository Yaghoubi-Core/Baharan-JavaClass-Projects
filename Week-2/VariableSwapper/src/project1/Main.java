package project1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please Enter num1");
        int num1 =reader.nextInt();
        System.out.println("Please Enter num2");
        int num2= reader.nextInt();
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        System.out.println("------------Processing------------");

        num1 = num1+num2;
        num2 = num1-num2;
        num1=num1-num2;
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);

    }

}
