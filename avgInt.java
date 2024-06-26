// Напишите программу, которая считывает последовательность целочисленных значений из стандартного ввода и находит среднее значение.
// Подробности:
// - Вы должны считывать значения последовательности, пока следующее не станет 0. Нулевое значение означает конец входной последовательности и не является ее частью.
// - Последовательность гарантированно содержит хотя бы одно значение.
// - Среднее значение также является целым числом. Используйте целочисленные операции.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num; // числа
        int sum = 0;
        int count = 0;
        do {
            num = input.nextInt(); // считываем новое значение
            if (num != 0) {
                sum += num;
                count++;
            } else { break; }
        } while (num != 0); // продолжаем цикл, пока не встретим 0
        System.out.println(sum / count);
    }
}
