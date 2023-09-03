public class Lesson6 {
    /**
     * Задание 6. Разворот числа
     * С клавиатуры вводится число n, десятичная запись которого не содержит нулей. Получите число, записанное теми
     * же цифрами, но в противоположном порядке. При решении
     * этой задачи разрешается только рекурсия и целочисленная
     * арифметика. Метод должен возвращать целое число, являющееся результатом работы программы, выводить число по
     * одной цифре нельзя.
     * Ввод: 179
     * Вывод: 971
     */

    public static void main(String[] args) {
        System.out.println(recursion(N, tmp));
    }

    public static int N = 179;
    public static final int tmp = 0;

    public static int recursion(int n, int tmp) {
        int res = tmp * 10 + n % 10;
        if (n > 10) {
            res = recursion(n/10, res);
        }
        return res;
    }
}
