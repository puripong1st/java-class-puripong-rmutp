import java.util.Scanner;

public class Puripongclass4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 2; i <= 12; i++) {
            System.out.println("แม่ " + i + " :");
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("-----------------------");
            System.out.println("กด Enter เพื่อไปแม่ต่อไป ");
            scanner.nextLine();
        }
        scanner.close();
    }
}
