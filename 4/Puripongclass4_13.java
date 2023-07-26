import java.util.Scanner;

public class Puripongclass4_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("เศษ : ");
        int numerator = scanner.nextInt();
        System.out.print("ส่วน : ");
        int denominator = scanner.nextInt();

        int wholePart = numerator / denominator;
        int remainder = numerator % denominator;

        System.out.print(numerator + "/" + denominator + " = ");
        if (wholePart > 0) {
            System.out.print(wholePart + " (" + remainder + "/" + denominator + ")");
        } else {
            System.out.print(remainder + "/" + denominator);
        }
        System.out.println();

    }

}
