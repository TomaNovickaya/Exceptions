/**Задание 2
 **/

import java.util.Scanner;

public class HW2_2 {
    public static void main(String[] args) {
         int[] intArray = {5, 7, 3, 12, 10, 8, 9, 2, 10, 6, 1};
        try {
        
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
             System.out.println("Catching exception: " + e);
            }

    }
}
