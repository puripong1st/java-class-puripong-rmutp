
/* เขียนโปรแกรมต่อไปนี้เพื่อแปลงค่าต่อไปนี้เป็นนาที
 * จัดทำวันที่ 7/25/2023
 */
import java.util.Scanner;

public class PuripongClass3_4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("วินาที: ");
        double second = scanner.nextDouble();

        double secpulsmin = second / 60;

        System.out.println("จากวินาทีที่ " + second + " ได้เป็นนาที " + secpulsmin);

        scanner.close();
    }

}
