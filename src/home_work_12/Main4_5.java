package home_work_12;

import java.util.Scanner;

/**
 * 4.5 Буква или иной символ
 */
public class Main4_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите символ");
//        int index = console.nextInt();
//        char symbol = (char) index;
        char symbol = console.nextLine().charAt(0);

        if(Character.isLetter(symbol)){
//        if((symbol >= 65 && symbol <= 90) || (symbol >= 97 && symbol <= 1255)){
            System.out.println("Буква");
        } else {
            System.out.println("Не буква");
        }
    }
}
