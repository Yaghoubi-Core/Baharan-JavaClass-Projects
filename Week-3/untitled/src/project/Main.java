package project;

public class Main {
    public static void main(String[] args) {
        int mabda = 2;
        int maghsad=1000;
        for (int i = mabda; i <= maghsad; i++) {
            boolean isPrime = true;

            for (int p = 2; p < i; p++) {
                if (i % p == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}