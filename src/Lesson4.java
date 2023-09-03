public class Lesson4 {
    /**
     * Задание 4. Цифры числа справа налево
     * Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке, разделяя их пробелами. Разрешена
     * только рекурсия и целочисленная арифметика.
     * Ввод: 179
     * Вывод: 9 7 1
     */

    public static void main(String[] args) {
        printReversNumber(N);
    }

    public static int N = 179;

    public static void printReversNumber(int N) {
        int a = N % 10;
        System.out.println(a);
        if (String.valueOf(N).length() == 1) {
            return;
        }
        N = N / 10;
        printReversNumber(N);
    }
}
