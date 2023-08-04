
/* เขียนโปรแกรมคำนวณแปลงค่าองศาเซลเซียสเป็นฟาเรนไฮต์
 * ใช้สูตร  C = (5/9) * (F-32)
 * จัดทำวันที่ 7/25/2023
 */
import java.util.Scanner;

public class PuripongClass3_4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณาใส่องศาเซลเซียส: ");
        double celsius = scanner.nextDouble();

        double celsiusToFahrenheit = (9.0 / 5.0) * celsius - 32;

        double fahrenheit = celsiusToFahrenheit;
        System.out.println("องศาฟาเรนไฮต์: " + fahrenheit + " F");

        scanner.close();
    }

}
