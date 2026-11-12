package project6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        do {
            ArrayList<Float> scores = new ArrayList();
            System.out.println("Please Enter The First Score");
            String inputScore1 = reader.nextLine();
            scores.add(toFloat(inputScore1));
            System.out.println("Please Enter The Second Score");
            String inputScore2 = reader.nextLine();
            scores.add(toFloat(inputScore2));
            System.out.println("Please Enter The Third Score");
            String inputScore3 = reader.nextLine();
            scores.add(toFloat(inputScore3));
            System.out.println("Please Enter The Fourth Score");
            String inputScore4 = reader.nextLine();
            scores.add(toFloat(inputScore4));
            System.out.println("Please Enter The Fifth Score");
            String inputScore5 = reader.nextLine();
            scores.add(toFloat(inputScore5));
            float sum = 0.0F;
            for (float score : scores) {
                sum = sum + score;
            }
            float avg = sum / scores.size();
            float distanceToAvg = Math.abs(scores.get(0) - avg);
            float nearValue = scores.get(0);
            for (float score : scores) {
                float near = Math.abs(avg - score);
                if (near < distanceToAvg) {
                    distanceToAvg = near;
                    nearValue = score;
                }
            }

            System.out.println("The average of scores is: " + avg);
            System.out.println("The Maximum Score is: " + Collections.max(scores));
            System.out.println("The Minimum Score is: " + Collections.min(scores));
            System.out.println("The nearest Score to avg is: " + nearValue);
            System.out.println("برای خروج کلید 0 را فشار دهید \n در غیر اینصورت اینتر را فشار دهید");

            if (reader.nextLine().trim().equals("0")) {
                System.exit(0);
            }
            System.out.println("---------------------------");
        } while (true);
    }

    public static float toFloat(String input) {
        Scanner reader = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^\\s*(([0-9]|1[0-9])(\\.[0-9]{1,2})?|20(\\.0{1,2})?)\\s*$");
        String patternError = "شما تنها می توانید عدد بین صفر تا بیست و دورقم اعشار استفاده کنید.";
        float output = 0.0F;
        while (true) {
            if (input.matches(pattern.pattern())) {
                output = Float.parseFloat(input);
                break;
            } else {
                System.err.println("------------------------" + patternError + "------------------------");
                System.out.println("عدد را مجددا وارد بفرمایید");
                input = reader.nextLine();
            }
        }
        return output;

    }
}
