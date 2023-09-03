public class Lesson10 {
    /**
     * Задание 10. НОД
     * Написать рекурсивный статический метод нахождения
     * наибольшего общего делителя двух целых чисел.
     * Ввод: 10 15
     * Вывод: 5
     */

    public static void main(String[] args) {
        greatestCommonDivisor(a, b);
    }

    static int a = 24;
    static int b = 18;
    static int counter = Math.max(a, b);

    public static void greatestCommonDivisor(int a, int b) {
        if (counter == 1) {
            return;
        }
        if (a % counter == 0 && b % counter == 0) {
            System.out.println(counter);
            return;
        }
        counter--;
        greatestCommonDivisor(a,b);
    }
}
