import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStranger = scanner.nextInt();
        int i = 0;
        if (countStranger == 0) {
            System.out.println("Оу... Похоже здесь никого...");
        } else if (countStranger == -1) {
            System.out.println("Серьезно? А что так негативно?");
        } else {
            while (i < countStranger) {
                String name = scanner.next();
                System.out.println("Привет, " + name);
                i++;
            }
        }
    }
}
