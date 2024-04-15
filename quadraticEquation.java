// Напишите программу для решения квадратных уравнений.
// Для заданных коэффициентов квадратного уравнения (ax² + bx + c = 0), верните один или два корня уравнения, если они существуют в области действительных чисел.
// Входное значение задается через System.in. Выходное значение должно быть напечатано в System.out.
// Формат вывода:
// - "x₁ x₂" (два корня в порядке возрастания, разделенные пробелом), если есть два корня
// - "x" (просто значение корня), если есть единственный корень
// - просто строковое значение "без корней", если корня нет.
// - корни - вещественные числа
// Параметр a гарантированно не равен нулю.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(); // ax^2
        int b = input.nextInt(); // bx
        int c = input.nextInt(); // c

        if (a != 0) {
            double D = b * b - 4 * a * c;
            if (D > 0) {
                double x1 = (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (-b - Math.sqrt(D)) / (2 * a);
                if (x1 < x2) {
                    System.out.println(x1 + " " + x2); }
                else { System.out.println(x2 + " " + x1); }
            } else if (D == 0) {
                double x = -b / (2 * a);
                System.out.println(x);
            } else {
                System.out.println("без корней");
            }
        } else {
            System.out.println("Коэффициент 'a' не может быть равен нулю");
        }
    }
}
