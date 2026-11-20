package project1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Menu menu = new Menu();
        System.out.println("Hello World!");
        float[] gradesDataBase = new float[0];
        do {
            menu.menu();
            int option = reader.nextInt();
            if (option == 0) {
                System.exit(0);
            } else if ((gradesDataBase.length == 0 && option != 1)) {
                System.err.println("No Grade in Memory");
                continue;
            }
            switch (option) {
                case 1:
                    System.err.println("----------ADDING GRADES-----------"
                            + "\nEnter the count of grades you want to add: ");
                    int gradeValues = reader.nextInt();
                    reader.reset();
                    gradesDataBase = addStudentGrades(gradesDataBase, gradeValues);
                    break;
                case 2:

                    System.err.println("----------SHOWING GRADES-----------");
                    showStudentGrades(gradesDataBase);

                    break;
                case 3:
                    System.err.println("----------EDITING GRADES-----------");
                    System.out.println("please enter the id you want to edit\n" +
                            "enter -1 to view grades and id");
                    int index = reader.nextInt();
                    if (index == -1) {
                        showStudentGrades(gradesDataBase);
                        System.out.println("Enter The Grade Id you want to edit");
                        reader.reset();
                        index = reader.nextInt();
                    }
                    System.out.println("please enter the new value you want to replace");
                    int value = reader.nextInt();
                    gradesDataBase = editStudentGrades(gradesDataBase, index, value);
                    break;
                case 4:
                    System.err.println("----------SORTING GRADES-----------");
                    int[] sortId= sortId(gradesDataBase);
                    float[] sortGrades = sortScore(gradesDataBase);
                    for (int i = 0; i < sortGrades.length; i++) {
                        System.out.println("Id : "+sortId[i]+" , Grade : "+sortGrades[i]);
                    }
                    break;
                case 5:
                    System.err.println("----------HIGHEST GRADE-----------");
                    System.out.println("id(s) : " + maxIdByScore(gradesDataBase) + "\nvalue : " + maxScore(gradesDataBase));
                    break;
                case 6:
                    System.err.println("----------LOWEST GRADE-----------");
                    System.out.println("id(s) : " + minIdByScore(gradesDataBase) + "\nvalue : " + minScore(gradesDataBase));
                    break;
                case 7:
                    System.err.println("----------AVG GRADES-----------");
                    System.out.println("the avg of all grades is : " + avgScores(gradesDataBase));
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Invalid!!!");
            }
        } while (true);

    }

    public static float[] addStudentGrades(float[] dataBase, int valNum) {
        float[] output = new float[dataBase.length + valNum];
        Scanner reader = new Scanner(System.in);
        int count = 1;
        for (int i = 0; i < output.length; i++) {
            if (i < dataBase.length) {
                output[i] = dataBase[i];
            }
            if (dataBase.length <= i) {
                System.out.print("please enter grade " + count + " : ");
                output[i] = reader.nextFloat();
                reader.reset();
                count++;
            }
        }
        return output;
    }

    public static void showStudentGrades(float[] dataBase) {
        for (int i = 0; i < dataBase.length; i++) {
            System.out.println("Grade " + (i + 1) + " : " + dataBase[i]);
        }
    }

    public static float[] editStudentGrades(float[] dataBase, int index, float value) {
        float[] output = new float[dataBase.length];
        for (int i = 0; i < dataBase.length; i++) {
            output[i] = dataBase[i];
        }
        output[index - 1] = value;
        return output;
    }

    public static double avgScores(float[] scores) {
        double sum = 0.0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        double avg = sum / scores.length;
        return avg;
    }

    public static float maxScore(float[] scores) {
        float max = scores[0];
        for (float score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;

    }

    public static String maxIdByScore(float[] scores) {
        StringBuilder highRank = new StringBuilder();
        float maxScore = maxScore(scores);
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                highRank.append((i + 1) + ",");
            }
        }

        return highRank.deleteCharAt(highRank.length() - 1).toString();
    }

    public static float minScore(float[] scores) {
        float min = scores[0];
        for (float score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }

    public static String minIdByScore(float[] scores) {
        StringBuilder lowRank = new StringBuilder();
        float minScore = minScore(scores);
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == minScore) {
                lowRank.append((i + 1) + ",");
            }
        }

        return lowRank.deleteCharAt(lowRank.length() - 1).toString();
    }

    public static float[] sortScore(float[] scores) {
        float[] sortScores = scores.clone();
        for (int i = 0; i < sortScores.length - 1; i++) {
            for (int a = 0; a < sortScores.length - 1 - i; a++) {
                if (sortScores[a] > sortScores[a + 1]) {
                    float temp = sortScores[a];
                    sortScores[a] = sortScores[a + 1];
                    sortScores[a + 1] = temp;
                }
            }
        }
        return sortScores;
    }

    public static int[] sortId(float[] scores) {
        int[] sortId = new int[scores.length];
        float[] sortScores = sortScore(scores);
        for (int i = 0; i < sortScores.length; i++) {
            for (int j = 0; j < scores.length; j++) {
                if (sortScores[i] == scores[j]) {
                    sortId[i] = j+1;
                }
            }
        }
        return sortId;
    }

}

