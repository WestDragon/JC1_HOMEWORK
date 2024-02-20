package home_work_1;

import java.util.Objects;
import java.util.Scanner;

/**
 * 6. Запросить у пользователя через консоль его имя. В данном задании у вас должно получиться 3 класса.
 * 	Что в итоге надо сделать (общее условие):
 * 		1. Если имя будет равно имени "Вася" тогда в консоль должно вывести сообщение "Привет!" на одной строке, а на второй "Я тебя так долго ждал".
 * 		2. Если имя будет равно имени "Анастасия" тогда в консоль должно вывести сообщение "Я тебя так долго ждал".
 * 		3. В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".
 * 	Как это сделать:
 * 		6.1 Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи if else
 */
public class Main6_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите свое имя");
        String name = console.nextLine();

        if(Objects.equals(name, "Вася")){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else {
            if(Objects.equals(name, "Анастасия")){
                System.out.println("Я тебя так долго ждал");
            } else {
                System.out.println("Добрый день, а вы кто?");
            }
        }
    }
}
