package home_work_12;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = console.nextInt(); //40 - 0010 1000
        System.out.println("Введите число b");
        int b = console.nextInt(); //82 - 0101 001git statusпример
        int y = a & b; // 0 - 0000 000
        int n = a | b; // 122 - 0111 1010

        System.out.println(y);
        System.out.println(n);
    }
}
