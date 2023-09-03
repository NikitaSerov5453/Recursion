public class Lesson8 {
    /**
     * Задание 8. Степень числа
     * Вычислить результат возведения числа m в степень n, используя рекурсию. В статический метод передается 2 параметра – число и степень.
     */

    public static void main(String[] args) {
        pow(number, 2);
    }

    public static int number = 159;
    public static int a = number;

    public static void pow(int number, int degree) {
        if (degree == 1) {
            System.out.println(number);
            return;
        }
        number = number * a;
        degree--;
        pow(number, degree);
    }
}
