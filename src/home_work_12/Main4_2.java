package home_work_12;

import java.util.Scanner;

/**
 * Определить нечётное число
 */
public class Main4_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = console.nextInt();
        System.out.println("Введите число b");
        int b = console.nextInt();
        System.out.println("Введите число c");
        int c = console.nextInt();

        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        int result = a + b + c - (min + max);

        System.out.println("Среднее: " + result);
    }
}
