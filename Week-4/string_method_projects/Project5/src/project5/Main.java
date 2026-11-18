package project5;

public class Main {
    public static void main(String[] args) {
        /*String text = "Java";
        int position = text.indexOf("x");
        System.out.println(text.charAt(position));
        int score = "90";
        if (score >= 60) { System.out.println("pass"); }
        else if (score >= 90) { System.out.println("excellent"); }*/
        //1 runtime error 8: string can not be in int variable
        //-------------------------------------------------
      /*  String text = "Java";
        int position = text.indexOf("x");
        System.out.println(text.charAt(position));
        int score = 90;
        if (score >= 60) { System.out.println("pass"); }
        else if (score >= 90) { System.out.println("excellent"); }
        // 15: .StringIndexOutOfBoundsException: String index out of range: -1*/
        //--------------------------------------------------
       /* String text = "Java";
        int position = text.indexOf("x");
        System.out.println(text.charAt(position));
        int score = 90;
        if (score >= 60) { System.out.println("pass"); }
        else if (score >= 90) { System.out.println("excellent"); }*/
        //step over
        //مربوط به کلیت برنامه است
        //step in
        //وارد توابع میشود
        //--------------------------------------------------
        String text = "Java";
        int position = text.indexOf("a");
        System.out.println(text.charAt(position));
        int score = 90;
        if (score >= 60) { System.out.println("pass"); }
        else if (score >= 90) { System.out.println("excellent"); }
//perfect
    }
}
