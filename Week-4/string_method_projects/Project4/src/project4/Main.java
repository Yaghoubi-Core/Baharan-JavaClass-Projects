package project4;

public class Main {
    public static void main(String[] args) {
        String firstWord="Hello";
        StringBuilder sb = new StringBuilder(firstWord);
        String secondWord="World!!!";
        sb.append(secondWord);
        sb.insert(5," ");
        String finalWorld= sb.toString();
        System.out.println(finalWorld);
    }
}
