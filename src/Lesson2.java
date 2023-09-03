import java.util.Map;

public class Lesson2 {
    /**
     * Задание 2. Точная степень двойки
     * Дано натуральное число N. Выведите слово YES, если число
     * N является точной степенью двойки, или слово NO – в противном случае.
     * Операцией возведения в степень пользоваться нельзя!
     * Ввод: 3 8
     * Вывод: NO YES
     */

    public static void main(String[] args) {
        pow(number);
    }

    public static int number = 17;
    public static void pow(double number) {
        int degree = 2;
        number = number / degree;
        if (number == 1.00) {
            System.out.println("YES");
            return;
        }
        else if (number < 2 && number > 1) {
            System.out.println("NO");
            return;
        }
        pow(number);
    }
}
