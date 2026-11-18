package project1;

public class Main {
    public static void main(String[] args) {
        // length، charAt، indexOf و substring
        String name = "Mohammad";
        int length = name.length();
        char secondChar = name.charAt(1);
        int findChar = name.indexOf("mmad");
        String sub = name.substring(5);
        System.out.println(length);
        System.out.println(secondChar);
        System.out.println(findChar);
        System.out.println(sub);

    }
}
