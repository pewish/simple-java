// Напишите программу, которая принимает на вход размер двумерного массива и заполняет его целыми числами начиная с одного по спирали (по часовой стрелке от верхнего левого угла по спирали).
// В качестве разделителя при выводе строки используйте пробел.
// Пример входных данных:
// 5 6
// Вывод в консоль:
// 1 2 3 4 5 6
// 18 19 20 21 22 7
// 17 28 29 30 23 8
// 16 27 26 25 24 9
// 15 14 13 12 11 10

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // размер двумерного массива
        int[][] matrix = new int[n][n];
        int value = 1; // начальное значение для заполнения матрицы
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Заполнение верхней горизонтальной строки слева направо
            for (int col = leftCol; col <= rightCol; col++) {
                matrix[topRow][col] = value++;
            }
            topRow++;

            // Заполнение правого столбца сверху вниз
            for (int row = topRow; row <= bottomRow; row++) {
                matrix[row][rightCol] = value++;
            }
            rightCol--;

            // Заполнение нижней горизонтальной строки справа налево
            if (topRow <= bottomRow) {
                for (int col = rightCol; col >= leftCol; col--) {
                    matrix[bottomRow][col] = value++;
                }
                bottomRow--;
            }

            // Заполнение левого столбца снизу вверх
            if (leftCol <= rightCol) {
                for (int row = bottomRow; row >= topRow; row--) {
                    matrix[row][leftCol] = value++;
                }
                leftCol++;
            }
        }

        // Вывод двумерного массива
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
