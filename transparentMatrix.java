// Напишите программу, которая принимает в качестве параметра размеры двумерного целочисленного массива , а затем и сам массив (матрицу) и возвращает его транспонированным.
// В качестве разделителя в строке используйте пробел.
// Результат транспонирования матрицы – это перевернутая по главной диагонали версия исходной матрицы.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt(); // количество строк
        int cols = input.nextInt(); // количество столбцов

        // Создание и заполнение исходной матрицы
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Создание и заполнение транспонированной матрицы
        int[][] transposedMatrix = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        // Вывод транспонированной матрицы
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[i][j]);
                if (j < rows - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
