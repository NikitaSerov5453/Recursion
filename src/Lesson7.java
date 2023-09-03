public class Lesson7 {
    /**
     *Задание 7. Палиндром
     * Дано предложение, состоящее только из строчных латинских букв. Проверьте, являются ли слова в предложении
     * палиндромом. Выведите YES или NO.
     * Ввод: radar yes
     * Вывод: YES NO
     */

    public static void main(String[] args) {
        checkingEntireLine(string);
    }

    public static String string = "radar yes";
    public static int counter = 0;
    public static int counter1 = 0;

    public static void palindrome(String string) {
        if (counter == string.length()) {
            System.out.print("YES ");
            return;
        }
        if (string.charAt(counter) == string.charAt(string.length() - (1 + counter))) {
            counter++;
            palindrome(string);
        } else {
            System.out.print("NO ");
        }
    }

    public static void checkingEntireLine(String string) {
        palindrome(string.contains(" ") ? string.split(" ")[counter1] : string);
        if (counter1 == 1) {
            return;
        }
        counter = 0;
        counter1++;
        checkingEntireLine(string);
    }
}
