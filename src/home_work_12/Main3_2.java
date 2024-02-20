package home_work_12;


import java.util.Scanner;

public class Main3_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = console.nextInt();

        if(a > 10) {
            System.out.println("Отлично, хорошая работа");
        } else {
            System.out.println("Ну ничего, будет и больше");
        }

        if(a > 10) System.out.println("Отлично, хорошая работа");
        else System.out.println("Ну ничего, будет и больше");

        if(a > 10)
            System.out.println("Отлично, хорошая работа");
        else
            System.out.println("Ну ничего, будет и больше");
            System.out.println("Я все равно рад");
    }
}
