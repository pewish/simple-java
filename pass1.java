import java.util.Scanner;

public class Main {
    final static int PASSWORD = 133976;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass = scanner.nextInt();

        if (pass == PASSWORD) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}
