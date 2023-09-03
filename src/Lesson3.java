import java.util.Arrays;

public class Lesson3 {
    /**
     * Задание 3. Сумма цифр числа
     * Дано натуральное число N. Вычислите сумму его цифр.
     * Ввод: 179
     * Вывод: 17
     */

    public static void main(String[] args) {
        sumDigits(string);

    }

    public static int N = 179;
    public static String string = Integer.toString(N);
    public static int counter = 0;
    public static int b = 0;

    public static void sumDigits(String string) {
        int a = Integer.parseInt(String.valueOf(string.charAt(counter)));
        b += a;
        if (a == Integer.parseInt(String.valueOf(string.charAt(string.length() - 1)))) {
            System.out.println(b);
            return;
        }
        counter++;
        sumDigits(string);
    }
}
