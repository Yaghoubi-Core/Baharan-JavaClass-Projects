package project3;

public class Main {
    public static void main(String[] args) {
        String sample = "Hello How Are You";
        String sample2 = sample.strip();
        System.out.println("is empty? "+"\nsample1\n"+sample.isEmpty()+"\nsample2\n"+sample2.isEmpty());
        System.out.println("has blank? "+"\nsample1\n"+sample.isBlank()+"\nsample2\n"+sample2.isBlank());
    }
}
