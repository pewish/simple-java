// Напишите программу, которая должна получить на вход размерность массива больше нуля и сам массив значений int и вернуть сумму четных чисел.
// Если четных чисел в массиве нет, сумма равна 0.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // длина массива
        if (n <= 0) {
            System.out.println("Ошибка!");
        } else {
            int sum = 0;
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = input.nextInt();
                if (array[i] % 2 == 0) {
                    sum += array[i];
                }
            }
            //if (sum == 0) {
                //System.out.println("Четных чисел нет");
            //} else {
                System.out.println(sum);
        }
    }
}
