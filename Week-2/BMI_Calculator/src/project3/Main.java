package project3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Pattern inputPattern = Pattern.compile("^(\\s*\\d{1,4})([\\.]\\d{1,3}\\s*)?$");
        String errorPattern = "---------------------------------------\nخطا: \n مقدار ورودی تنها میتواند مقداری صحیح 4 رقمی\nیا کقداری اعشاری با 4 رقم صحیح و 3 رقم اعشاری باشد\nو همچنین مقدار حالی نمی تواند باشد!!!\n ---------------------------------------";
        do {
            String inputHeight = "0.0";
            String inputWeight = "0.0";
            //چاپ درخواست/ ورودی قد / اعتبار سنجی 
            while (true) {
                System.out.println("مقدار قد خود را وارد نمایید به متر : ");
                inputHeight = reader.nextLine();
                if (inputHeight.matches(inputPattern.pattern())) {
                    break;
                } else {
                    System.err.println(errorPattern);
                }
            }
            // چاپ ذرخواست ورودی وزن اعتبار سنجی
            while (true) {
                System.out.println("مقدار وزن خود را وارد نمایید به کیلوگرم : ");
                inputWeight = reader.nextLine();
                if (inputWeight.matches(inputPattern.pattern())) {
                    break;
                } else {
                    System.err.println(errorPattern);
                }
            }

            double height = Double.parseDouble(inputHeight.trim());
            double weight = Double.parseDouble(inputWeight.trim());

            double bmi =weight/ (height * height) ;

            String situation;
            if (bmi < 18.5) {
                situation = "کمبود وزن";
            } else if (bmi < 25) {
                situation = "وزن نرمال";
            } else if (bmi < 30) {
                situation = "اضافه وزن";
            } else if (bmi < 35) {
                situation = "چاقی درجه ۱";
            } else if (bmi < 40) {
                situation = "چاقی درجه ۲";
            } else {
                situation = "چاقی درجه ۳ (شدید)";
            }

            System.out.println("شاخص توده بدنی شما : \n" + bmi + "  kg/m²" + "\n" + "این عدد بر اساس طبقه بندی سازمان سلامت جهانی در دسته ی : \n " + situation+"\n قرار می گیرد. \n" + "\n--------------------------------------");

            System.out.println("برای خروج عدد 0 را وارد کنی درغیر اینصورت اینتر بزنید...");

            if (reader.nextLine().trim().equals("0")){
                break;
            }

        } while (true);
    }
}
