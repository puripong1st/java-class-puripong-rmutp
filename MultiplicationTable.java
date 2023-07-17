import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.print("NUMBER (OUT -1): ");
            number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            printMultiplicationTable(number);
        }
    }

    public static void printMultiplicationTable(int number) {
        System.out.println("KEY " + number);
        System.out.println("----------------------");

        for (int i = 1; i <= 12; i++) {
            int result = number * i;
            System.out.printf("%d x %d = %d%n", number, i, result);
        }
    }
}
