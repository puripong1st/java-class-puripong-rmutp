import java.util.Scanner;

public class Puripongclass5_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรอกค่าเลขจำนวนเต็มในฐานสิบ: ");
        int decimalNumber = scanner.nextInt();

        String hexadecimalNumber = Integer.toHexString(decimalNumber);

        System.out.println("เลขฐานสิบหก: " + hexadecimalNumber);
    }
}
