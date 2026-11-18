package project2;

public class Main {
    public static void main(String[] args) {
        String sample = "Hello,world,this,is,a,comma,separated,sentence";
        String[] words = sample.split(",");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        //جواب ازمایش : فیلد اخر به صورت "" ذخیره میشود
    }
}
