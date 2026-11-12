package excercise5;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner reader = new Scanner(System.in);
        String username = "admin";
        String password = "admin1234";
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
                    int inputIntSMS = Integer.parseInt(inputStrSMS);
                    if (inputIntSMS == smsCode) {
                        System.out.println("شما وارد شدید خوش آمدید!!!\n پایان برنامه");
                        exit("0");
                    }else {
                        System.err.println("اس ام اس کد نادرست است!!");
                    }
                }
            }else{
                System.err.println("رمز عبور یا نام کاربری نادرست است");
                }
            }

        }
    static void exit(String str) {
        if (str.trim().equals("0")) {
            System.exit(0);
        }
    }
}






