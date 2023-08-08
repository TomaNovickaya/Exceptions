/**Реализуйте метод, который запрашивает у пользователя 
 * ввод дробного числа (типа float), и возвращает введенное значение. 
 * Ввод текста вместо числа не должно приводить к падению приложения, 
 * вместо этого, необходимо повторно запросить у пользователя ввод данных
 **/

import java.util.Scanner;

public class HW2_1 {
    public static void main(String[] args) {
        float num = getFloatNum();
        System.out.println("Дробное число: " + num);
    }

    public static float getFloatNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        while (!scanner.hasNextFloat()) {
            System.out.print("Некооректно введено число. Введите дробное число: ");
            scanner.next();
        }
        float num = scanner.nextFloat();
        scanner.close();
        return num;
    }
}
