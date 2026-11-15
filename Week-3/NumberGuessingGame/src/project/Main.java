package project;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        int randNumber = random.nextInt(99) + 1;
        int[] nums = new int[7];
        boolean isCorrect = false;
        System.out.println("Please Enter Your Guess: (You have only 7 chances) ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = reader.nextInt();
            reader.reset();
            if (nums[i] == randNumber) {
                isCorrect = true;
                break;
            } else if (nums[i] < randNumber) {
                if(i!=6)System.err.println("Higher");
            } else if (nums[i] > randNumber) {
                if(i!=6)System.err.println("Lower");
            }
        }
        if (isCorrect) {
            System.out.println("-----------------------------");
            System.out.println("Congratulation!!!");
            System.out.println("The random number : " + randNumber);
            System.out.println("Your choice(s) :");
            for (int input : nums) {
                if (input==0){
                    break;
                }
                System.out.println(input);
            }
        } else {
            System.out.println("-----------------------------");
            System.err.println("You Lose!!!");
            System.out.println();
            System.out.println("The random number : " + randNumber);
            System.out.println("Your choice(s) :");
            for (int input : nums) {
                System.out.println(input);
            }
        }
    }
}
