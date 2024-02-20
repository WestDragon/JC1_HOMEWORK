package home_work_12;

/**
 * 	2.1 5 + 2 / 8
 * 	2.2 (5 + 2) / 8
 * 	2.3 (5 + 2++) / 8
 * 	2.4 (5 + 2++) / --8
 * 	2.5 (5 * 2 >> 2++) / --8
 * 	2.6 (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
 * 	2.7 (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8
 * 	2.8 6 - 2 > 3 && 12 * 12 <= 119
 */
public class Main3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;
        int result = (a + b++) / c;

        b = 2;

        //int choice = 5 + 7 > 20 && 1 == 1 ? 68 : 22 * 2 >> b++;
        //result = (choice) / --c;

        int choice;
        if(5 + 7 > 20 && 1 == 1){
            choice = 68;
        } else {
            choice = 22 * 2 >> b++;
        }

        if(5 + 7 > 20 && 1 == 1)
            choice = 68;
        else
            choice = 22 * 2 >> b++;

        result = (choice) / --c;


         //6 - 2 > 3 && 12 * 12 <= 119
    }
}
