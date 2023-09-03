public class Lesson5 {
    /**
     * Задание 5. Цифры числа слева направо
     * Дано натуральное число N. Выведите все его цифры по
     * одной, в обычном порядке, разделяя их пробелами или новыми строками. При решении этой задачи нельзя использовать
     * строки, списки, массивы, циклы. Разрешена только рекурсия
     * и целочисленная арифметика.
     * Ввод: 179
     * Вывод: 1 7 9
     */

    public static void main(String[] args) {
        addingSpace(recursion(N, tmp));
    }

    public static int N = 179;
    public static final int tmp = 0;

    public static void addingSpace(int N) {
        int a = N % 10;
        System.out.print(a + " ");
        if (String.valueOf(N).length() == 1) {
            return;
        }
        N = N / 10;
        addingSpace(N);
    }

    public static int recursion(int n, int tmp) {
        int res = tmp * 10 + n % 10;
        if (n > 10) {
            res = recursion(n/10, res);
        }
        return res;
    }
}
