package home_work_12;

import java.util.Scanner;

/**
 *  2.6 (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
 * 	2.7 (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8
 */
public class Main3_1 {
    public static void main(String[] args) {
        int b = 2;
        int c = 8;

//        int result = (
//                (5 + 7 > 20) ? (68 >= 68) : (22 * 2 >> b++)
//        ) / --c;

        Scanner console = new Scanner(System.in);
        System.out.println("Введите число r");

        int r = console.nextInt();
        System.out.println("Введите число k");
        int k = console.nextInt();

//        int choice = (r + k > 20) ? (68 >= 68) : (22 * 2 >> b++);
        
        System.out.println((r + k > 20) ? (68 >= 68) : (22 * 2 >> b++));

//        int choice;
//        if(5 + 7 > 20){
//            choice = 68 >= 68;
//        } else {
//            choice = 22 * 2 >> b++;
//        }

//        int result = (choice) / --c;


    }
}
