import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Lesson12 {
    /**
     * Задание 12. Черепашка
     * На квадратной доске размером NхN расставлены случайные
     * целые положительные числа. Черепашка, находящаяся в
     * левом верхнем углу, мечтает попасть в правый нижний. При
     * этом, она может переползать только в клетку справа или в
     * клетку снизу (не наискосок) и хочет, чтобысумма всех чисел,
     * оказавшихся у нее на пути, была максимально возможной.
     * Показать на экране консоли эту сумму. Показать путь следования черепашки. Показать исходный массив в виде таблицы
     */

    public static void main(String[] args) {
        fieldArray(array);
        printArray(array);
        compressionPerimeter(array, copyArray);
        compression(array, copyArray);
        fieldWay(way, copyArray, array);
        System.out.println(Arrays.toString(way));
        System.out.println(sumNumbers);

    }

    static Scanner scanner() {
        return new Scanner(System.in);
    }

    static int arraySize = scanner().nextInt();
    static int[][] array = new int[arraySize][arraySize];
    static int[][] copyArray = new int[arraySize][arraySize];
    static int[] way = new int[arraySize * 2 - 1];
    static int number = array[0][0];
    static int number2 = array[0][0];
    static int i, j, k, l, x, y = 0;
    static int z = arraySize - 1;
    static int c = arraySize - 1;
    static int counter = arraySize * 2 - 2;
    static int sumNumbers = 0;

    public static void fieldArray(int[][] array) {
        array[i][j] = random(1, 100);
        if (i == array.length - 1 && j == array.length - 1) {
            return;
        }
        if (j == array.length - 1) {
            i++;
            j = -1;
        }
        j++;
        fieldArray(array);
    }

    public static void printArray(int[][] array) {
        for (int[] a : array) {
            System.out.print(Arrays.toString(a) + "\n");
        }
        System.out.println();
    }

    public static int random(int minValue, int maxValue) {
        return ThreadLocalRandom.current().nextInt(minValue, maxValue);
    }

    public static void compression(int[][] array, int[][] copyArray) {
        if (x != 0 && y != 0) {
            copyArray[x][y] = Math.max(array[x][y] + copyArray[x - 1][y], array[x][y] + copyArray[x][y - 1]);
        }
        if (x == array.length - 1 && y == array.length - 1) {
            return;
        }
        if (y == array.length - 1) {
            x++;
            y = -1;
        }
        y++;
        compression(array, copyArray);
    }

    public static void compressionPerimeter(int[][] array, int[][] copyArray) {
        if (k == 0) {
            number += array[k][l];
            copyArray[k][l] = number;
        }
        if (l == 0) {
            number2 += array[k][l];
            copyArray[k][l] = number2;
        }
        if (k == array.length - 1 && l == array.length - 1) {
            return;
        }
        if (l == array.length - 1) {
            k++;
            l = -1;
        }
        l++;
        compressionPerimeter(array, copyArray);
    }

    public static boolean isValid(int i, int j) {
        return i > 0 && j > 0 && i < arraySize && j < arraySize;
    }

    public static void fieldWay(int[] way, int[][] copyArray, int[][] array) {
        sumNumbers += array[z][c];
        way[counter] = array[z][c];
        if (counter == 0) {
            return;
        }
        if (isValid(z, c)) {
            if (copyArray[z][c - 1] > copyArray[z - 1][c]) {
                c--;
            } else {
                z--;
            }
        } else if (c == 0) {
            z--;
        } else if (z == 0) {
            c--;
        }
        counter--;
        fieldWay(way, copyArray, array);
    }

}
