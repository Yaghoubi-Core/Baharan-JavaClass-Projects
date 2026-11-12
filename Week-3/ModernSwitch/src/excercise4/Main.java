package excercise4;

import javax.swing.*;
import javax.swing.text.html.Option;

public class Main {
    static void main() {
        String[] colors = {"RED", "YELLOW", "GREEN", "BLACK", "BLUE", "PINK"};
        while (true) {
            Object option = JOptionPane.showInputDialog(null, "Please choose a color", "CHOOSING", JOptionPane.QUESTION_MESSAGE, null, colors, colors[0]);
            if (option==null){
                break;
            }
            String input = String.valueOf(option);
            switch (input) {
                case "RED" -> System.out.println("بایست");
                case "YELLOW" -> System.out.println("احتیاط کن");
                case "GREEN" -> System.out.println("میتونی حرکت کنی");
                default -> System.out.println("تعریف شده نیست");
            }

        }
    }
}
