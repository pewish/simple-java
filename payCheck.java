// Дано следующее условие: компания друзей посещает ресторан. Они решили разделить счет поровну и добавить 10 процентов от общей суммы счета в качестве чаевых.
// Далее друзья равными частями покрывают общую сумму платежа.
// Напишите программу, которая считывает общую сумму счета и количество друзей, а затем выводит размер части оплаты.
// Рассмотрим некоторые детали:
// - Программа должна читать данные из System.in
// - Общая сумма счета не может быть отрицательной. Если введенное значение отрицательное, программа останавливается и печатает: Еда не так плоха, чтобы за ее поедание доплачивали
// - Количество друзей не может быть отрицательным или нулевым. Если такое происходит, то программа останавливается и выводит: Кто здесь?!
// - Общая сумма счета, количество друзей и часть к оплате являются целыми числами.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumCheck = input.nextInt(); // счет
        int friends = input.nextInt(); // количество друзей
        int payCheck; // сумма на человека
        int percent; // чаевые

        if (sumCheck < 0) {
            System.out.println("Еда не так плоха, чтобы за ее поедание доплачивали");
        } else if (friends <= 0) {
            System.out.println("Кто здесь?!");
        } else {
            percent = (int) (sumCheck * 0.1) + sumCheck;
            payCheck = (percent / friends);
            System.out.println(payCheck);
        }
    }
}
