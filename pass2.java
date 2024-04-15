import java.util.Scanner;

public class Main {
    final static int PASSWORD = 133976;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input = console.nextInt();
        System.out.println(input == PASSWORD ? "Hello, Agent" : "Access denied");
    }
}
