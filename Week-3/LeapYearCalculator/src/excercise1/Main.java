package excercise1;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();
        boolean isKabise = false;

        if (input % 4 != 0) {
                if (input%100!=0){
                    isKabise=true;
                }else {
                    if (input%400==0){
                        isKabise=true;
                    }
                }
        }

        if (isKabise){
            System.out.println("سال کبیسه است");
        }else {
            System.out.println("سال کبیسه نیست");
        }

    }
}
