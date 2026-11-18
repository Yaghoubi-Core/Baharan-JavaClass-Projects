package project3;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Hello", "here", "no", "yes"};
        String[] reverseWords = new String[words.length];

        for (int b = 0; b < reverseWords.length; b++) {
                reverseWords[b] = words[-b+words.length-1];
        }
        for (String word : reverseWords) {
            System.out.println(word);
        }
    }
}
