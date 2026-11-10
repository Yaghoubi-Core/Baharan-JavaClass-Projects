package project1;


import project1.enums.TemperatureConversionType;
import project1.enums.TemperatureUnit;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //برنامه اول
        Scanner reader = new Scanner(System.in);
        TemperatureUnitConversion conversion = new TemperatureUnitConversion();
        //مشخص کردن
        Pattern numberPattern = Pattern.compile("^([+-]?\\d{1,3})(\\.\\d{1,4})?$");
//        Pattern comboPattern = Pattern.compile("^\\s*[01]\\s*$");
        String numberPatternError = "خطا :\n مقدار ورودی باید:\n عددی صحیح 3 رقمی\n یا عددی اعشاری با 3 رقم صحیح و 4 رقم اعشاری باشد!";
//        String choosePatternError = "شما تنها مجاز به انتخاب عدد \"0\" یا عدد \"1\" هستید!";
        while (true) {
            System.out.println(":دمای ورودی را به صورت سانتی گراد وارد کنید");
            String inputTemperature;
//            String chooseType;
            while (true) {
                inputTemperature = reader.nextLine();

                if (!(inputTemperature.matches(numberPattern.pattern()))) {
                    System.err.println("------------------------\n" + numberPatternError + "\n------------------------");
                    System.out.println(":دمای ورودی را به صورت سانتی گراد وارد کنید");
                } else if (Double.parseDouble(inputTemperature) < -273.15) {
                    System.err.println("مقدار ورودی تعریف نشده است (مقدار زیر صفر کلوین)");
                    System.out.println(":دمای ورودی را به صورت سانتی گراد وارد کنید");
                } else {
                    break;
                }
            }

//            while (true) {
//                System.out.println("برای تبدیل دمای سانتی گراد وارده به فارنهایت\nعدد \"0\"\nبرای تبدیل به کلوین\nعدد \"1\"");
//                chooseType = reader.nextLine();
//                if (chooseType.matches(comboPattern.toString())) {
//                    break;
//                } else {
//                    System.err.println("------------------------\n" + choosePatternError + "\n------------------------");
//                }
//            }
            System.out.println("-----------------------------------------\nنتیجه:");
            TemperatureUnit originUnit = TemperatureUnit.CENTIGRADE;
            conversion.setUnitAndValue(originUnit, Double.parseDouble(inputTemperature));
            double fahrenheit = 0.0;
            double kelvin = 0.0;
//            if (chooseType.contains("1")) {
            kelvin = conversion.getKelvin();
//            } else if (chooseType.contains("0")) {
            fahrenheit = conversion.getFahrenheit();

//            }
            System.out.printf("  ورودی شما سانتی گراد: %s " +
                    " \n دما به فارنهایت: %s " +
                    "\n دما به کلوین: %s ", inputTemperature, fahrenheit, kelvin);

            System.out.println("\nخروج: 0 \n");
            if ((reader.nextLine().trim().equals("0"))) {
                return;
            }
        }

    }
}


