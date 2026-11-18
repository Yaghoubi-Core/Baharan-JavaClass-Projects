package project5;

public class Main {
    public static void main(String[] args) {
        int sum1 =sum(4,5);
        int sum2=sum(new int[]{5,4,5,4});
        System.out.println(sum1);
        System.out.println(sum2);
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int[] items){
        int finalSum = 0;
        for (int num : items){
            finalSum = finalSum+num;
        }
        return finalSum;
    }
}
