// Напишите программу, которая получает из стандартного ввода размерность массива и все его элементы, после чего ищет в нем максимум и выводит на печать.
//Входной массив должен иметь не нулевой размер. Если указан нулевой размер сразу вывести "Массив нулевого размера". Входной массив может содержать любое значение типа int.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // длина массива
        if (n == 0) {
            System.out.println("Массив нулевого размера");
        } else {
            int max = Integer.MIN_VALUE;
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = input.nextInt();
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println(max);
        }
    }
}
