package project;

public class Main {
    public static void main(String[] args) {
        int z=0 ;
        for (int i = 1; i <= 100; i++) {
            if (!(i % 3 == 0 || i % 5 == 0 || i % 9 == 0)) {
                System.out.println(i);
            }
            if (i % 5 == 0 && i % 9 == 0){
               z=i;
                break;

            }
        }
        System.out.println("Operation stopped");
        System.out.println(z);
    }
}
