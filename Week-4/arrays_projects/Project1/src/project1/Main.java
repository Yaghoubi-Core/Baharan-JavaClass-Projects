package project1;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {45, -12, 48, 75, 77};
        if (numbers.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int temp = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (temp < numbers[i]) {
                temp = numbers[i];
            }

        }
        System.out.println(temp);
    }
}
