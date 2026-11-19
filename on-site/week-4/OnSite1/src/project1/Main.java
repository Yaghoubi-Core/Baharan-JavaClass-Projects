package project1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Hello World!");
        float[] grades = new float[10];

    }
    public static double avgScores(float[] scores){
        double sum =0.0;
        for (int i = 0 ; i<scores.length; i++){
            sum = sum + scores[i];
        }
        double avg = sum/scores.length;
        return avg;
    }
    public static float maxScore(float[] scores){
       float max = scores[0];
       for (float score : scores){
           if (score>max){
               max=score;
           }
       }
        return max;

    }
    public static float minScore(float[] scores){
        float min = scores[0];
        for (float score : scores){
            if (score<min){
                min=score;
            }
        }
        return min;
    }
    public static float[] sortScore(float[] scores){
        float[] sortScores= scores;
        for (int i = 0 ; i < sortScores.length ; i++){
            for (int a= 0; a<sortScores.length-i; a++){
                if (sortScores[a]>sortScores[a+1]){
                    float temp = sortScores[a];
                    sortScores[a]=sortScores[a+1];
                    sortScores[a+1]=temp;
                }
            }
        }
        return sortScores;
    }
}
