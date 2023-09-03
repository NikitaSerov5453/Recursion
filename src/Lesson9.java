public class Lesson9 {
    /**
     * Задание 9. Сумма чисел в диапазоне
     * Вычислить сумму чисел в определенном диапазоне. Начало
     * и конец диапазона задается параметрами.
     * Ввод: 5 9
     * Вывод: 35
     */

    public static void main(String[] args) {
        sumAllNumbers(beginning, end);
    }

    public static int beginning = 0;
    public static int end = 10;
    static int counter = 0;

    public static void sumAllNumbers(int beginning, int end) {
        if (beginning == end) {
            System.out.println(counter);
            return;
        }
        beginning++;
        counter += beginning;
        sumAllNumbers(beginning, end);
    }
}
