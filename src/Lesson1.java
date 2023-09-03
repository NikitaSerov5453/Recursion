public class Lesson1 {
    /**
     * ВНИМАНИЕ!!!
     * Все задания в данной работе направлены на изучение рекурсии, поэтому все решении должны основываться на
     * рекурсии. Все решения должны быть основаны на одном
     * методе.
     * В этих задачах для решения нельзя использовать:
     * ■ циклы;
     * ■ массивы;
     * ■ списки;
     * ■ строки.
     * Также могут быть и другие ограничения в конкретных задачах.
     * <p>
     * Задание 1
     * Даны два целых числа A и В. Выведите все числа от A до
     * B включительно, в порядке возрастания, если A < B, или в
     * порядке убывания – в противном случае.
     * Ввод: 5 1
     * Вывод: 5 4 3 2 1
     */

    public static void main(String[] args) {
        a(a, b);
    }
    public static int a = 100;
    public static int b = 10;
    public static int counter;

    public static void a(int a, int b) {
        int c;
        if (a < b) {
            c = b;
            b = a;
            a = c;
        }
        counter = b;
        System.out.println(counter);
        if (counter == a) {
            return;
        }
        b++;
        a(a,b);
    }
}
