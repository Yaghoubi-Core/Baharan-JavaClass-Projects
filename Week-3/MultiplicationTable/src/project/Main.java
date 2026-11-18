package project;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int input = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+ " * "+input+" = "+i * input);
        }
    }
}
