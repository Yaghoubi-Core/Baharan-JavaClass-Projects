package Project2;

import java.time.Duration;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Pattern secondTimePattern = Pattern.compile("\\s*\\d{1,16}\\s*");
        String errorTimePattern = "شما فقط میتوانید زمان را به صورت اعداد صحیح 1 تا 9 تا 16 رقم وارد کنید\n مقدار خالی قابل قبول نیست!!!";
        String inputTime = "0";
        do {
            while (true) {
                System.out.println("لطفا زمانتان را به ثانیه وارد کنید...");
                inputTime = reader.nextLine();
                if (inputTime.matches(secondTimePattern.pattern())) {
                    break;
                } else {
                    System.err.println(errorTimePattern);
                }
            }
            long secondTime = Long.parseLong(inputTime.trim());
            Duration duration = Duration.ofSeconds(secondTime);
            long hour = duration.toHours();
            long minute = duration.toMinutes() % 60;
            long second = duration.toSeconds() % 60;
            String format = "ساعت: " + hour + "\n" + "دقیقه: " + minute + "\n" + "ثانیه: " + second;
            System.out.println("زمان ورودی شما برابر است با :");
            System.out.println(format);
            System.out.println("برای خروج 0 را وارد کنید در غیر این صورت اینتر بزنید");
            if (reader.nextLine().trim().equals("0")){
                break;
            }
        }while (true);
    }
}
