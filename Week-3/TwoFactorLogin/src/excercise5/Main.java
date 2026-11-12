package excercise5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String username = "admin";
        String password = "admin123";
        int smsCode = 1234;
        while (true) {
            System.out.println("Enter Username\nExit: 0");
            String inputUserName = reader.nextLine();
            exit(inputUserName);
            System.out.println("Enter Password\nExit: 0");
            String inputPassword = reader.nextLine();
            exit(inputPassword);
            if (inputUserName.equals(username) && inputPassword.equals(password)) {
                while (true) {
                    System.out.println("لطفا اس ام اس کد را وارد کنید\n Exit: 0");
                    String inputStrSMS = reader.nextLine();
                    exit(String.valueOf(inputStrSMS));
                    int inputIntSMS = toInteger(inputStrSMS);
                    if (inputIntSMS == smsCode) {
                        System.out.println("شما وارد شدید خوش آمدید!!!\n پایان برنامه");
                        exit("0");
                    } else {
                        System.err.println("اس ام اس کد نادرست است!!");
                    }
                }
            } else {
                System.err.println("رمز عبور یا نام کاربری نادرست است");
            }
        }

    }

    public static void exit(String str) {
        if (str.trim().equals("0")) {
            System.exit(0);
        }
    }

    public static int toInteger(String str) {
       Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\s*\\d{4}\\s");
        String errorPattern = "کد اس ام اس تایید باید چهار رقم باشد";
        int output = 0;
        String again=str;
        while (true) {
            if (again.matches(pattern.pattern())) {
                output = Integer.parseInt(str.trim());
                break;
                //todo: اینجا بایداس ام اس ارور رو درستش کنی
            } else {
                System.err.println("--------------------------");
                System.err.println(errorPattern);
                System.out.println("کد اس ام اس را مجددا وارد بفرمایید");
                again= scanner.nextLine();
            }
        }
        return output;
    }
}






