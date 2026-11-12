package project;

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime  = true;
            for (int a = 2 ;a<i ; a++){
                if(i%a==0){
                    isPrime=false;
                }
            }
            if (isPrime){
                System.out.println(i);
            }
        }
    }
}
