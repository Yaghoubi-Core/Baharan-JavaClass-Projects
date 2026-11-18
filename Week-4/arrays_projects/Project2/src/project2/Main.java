package project2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("initialising number "+(i+1)+" : ");
            numbers[i] = scanner.nextInt();
        }
        int count=0;
        for (int num : numbers){
            if (num%2==0){
                count ++;
            }
        }
        System.out.println("------------------"+"the even num(s) is(are) : "+count);
    }
}