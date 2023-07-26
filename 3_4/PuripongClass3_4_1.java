
/* เขียนโปรแกรมคำนวณแปลงค่าองศาเซลเซียสเป็นองศาเคลวิน
 * ใช้สูตร  K = C + 273.15
 * เมื่อ K = หน้วยเป็นองศาเคลวิน C = องศาเซลเซียส
 * จัดทำวันที่ 7/25/2023
 */
import java.util.Scanner;

public class PuripongClass3_4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณาใส่องศาเซลเซียส: ");
        double celsius = scanner.nextDouble();

        double celsiusToKelvin = celsius + 273.15;

        double kelvin = celsiusToKelvin;
        System.out.println("องศาเคลวิน: " + kelvin + " K");

        scanner.close();
    }

}
