package project2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// برناممه ای بنویسید که اعداد اول بین 1 تا 1000 را پیدا کرده  و در خروجی چاپ کنید
        // عددی اول است که از عدد 2 تا آن عدد چیزی بر آن بخش پذیر نباشد

        for (int i = 2; i <= 1000; i++) {
            boolean isPrime  = true;
            for (int a = 2 ;a<i ; a++){
                if(i%a==0){
                    isPrime=false;
                }
            }
            if (isPrime){
                System.out.println(i);
            }
        }
    }
}
