/**Разработайте программу, которая выбросит Exception,
 * когда пользователь вводит пустую строку. Пользователю 
 * должно показаться сообщение, что пустые строки вводить нельзя.
 **/

import java.util.Scanner;

public class HW2_4 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
  Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        string = string.trim();
        if(string.isEmpty())
            throw new IllegalArgumentException("Строка не должна быть пустой!");
        else
            System.out.println(string);
    }
}
