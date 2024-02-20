package home_work_12;

import java.util.Scanner;

/**
 * Определить нечётное число
 */
public class Main4_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число а");

        int number = console.nextInt();

        int result = number % 2;

        if(result == 0){
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное. Остаток от деления " + result);
        }
    }
}
