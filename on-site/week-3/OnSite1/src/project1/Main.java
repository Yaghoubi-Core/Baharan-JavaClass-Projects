package project1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //یه عدد را گرفتن و صعودی چاپش کردن

        Scanner reader = new Scanner(System.in);
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int num3 = reader.nextInt();

        int temp;

        if (num2>num1){
            temp=num2;
            num2=num1;
            num1=temp;
        }

        if (num3>num1){
            temp=num3;
            num3=num1;
            num1=temp;
        }

        if (num3>num2){
            temp=num3;
            num3=num2;
            num2=temp;
        }

        System.out.println(num3);
        System.out.println(num2);
        System.out.println(num1);
    }
}