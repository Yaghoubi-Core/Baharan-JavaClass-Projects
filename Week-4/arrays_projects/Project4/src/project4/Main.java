package project4;

public class Main {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];
        numbers[0][0] = 5;
        numbers[0][1] = 5;
        numbers[0][2] = 5;
        numbers[1][0] = 5;
        numbers[1][1] = 5;
        numbers[1][2] = 5;
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int b = 0; b < numbers[i].length; b++) {
                sum = sum + numbers[i][b];
            }
            System.out.println(sum);
        }
    }
}
