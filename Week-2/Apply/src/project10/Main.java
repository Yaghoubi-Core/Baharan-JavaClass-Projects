package project10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = reader.nextLine();
        System.out.println("Please enter your age");
        int age = reader.nextInt();
        System.out.println("Please enter your score");
        float score = reader.nextFloat();

        if (score>=50&&age>=15){
            System.out.printf("name : %s\nage : %s\nscore : %s\nYou Applied!!!",name,age,score);
        }else {
            System.out.printf("name : %s\nage : %s\nscore : %s\n",name,age,score);
            System.err.println("You didnt Apply");
        }
    }
}