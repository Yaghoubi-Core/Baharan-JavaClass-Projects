package project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password = "password";
        boolean isLoggedIn = false;
        Scanner scanner = new Scanner(System.in);
        for (int i = 3; i > 0; i--) {
            System.out.println("enter the password ( " + i + " chance(s) ) : ");
            String input = scanner.nextLine();
            scanner.reset();
            if (input.equals(password)) {
                System.out.println("-------------------\nLogged In !!!");
                isLoggedIn = true;
                break;
            } else {
                System.err.println("-------------------\nFalse !");
            }
        }
        if (!isLoggedIn){
            System.err.println("---------------------\nAccount Just Locked !!!");
        }
    }
}
