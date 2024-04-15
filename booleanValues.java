// Напишите программу, которая должна получить размер массива и сам массив значений int и вернуть массив логических значений, где каждый элемент является результатом проверки:
// является ли соответствующий исходный элемент суммой двух предыдущих элементов в данном массиве.
// Подробности:
// - Длина входящего массива должна быть 2 или более.
// - Метод возвращает массив логических значений, где каждый элемент является результатом для соответствующего элемента в данном массиве.
// - Первые два элемента логического массива всегда false.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // длина массива
        if (n < 2) {
            System.out.println("Ошибка! Введите массив большей длины");
        } else {
            int[] array = new int[n];
            boolean[] valuesArray = new boolean[n];
            for (int i = 0; i < n; i++) {
                array[i] = input.nextInt();
            }
            valuesArray[0] = false;
            valuesArray[1] = false;

            // Обработка остальных элементов массива
            for (int i = 2; i < n; i++) {
                if (array[i - 1] + array[i - 2] == array[i]) {
                    valuesArray[i] = true;
                } else {
                    valuesArray[i] = false;
                }
            }

            // Вывод результата
            System.out.print("[");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(valuesArray[i] + ", ");
            }
            System.out.println(valuesArray[n - 1] + "]");
        }
    }
}
