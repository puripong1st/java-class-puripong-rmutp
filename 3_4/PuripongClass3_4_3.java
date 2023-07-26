
/* จากสูตรสมการกำลัง 2 ให้ ax²+bx+C = 0  ให้เขียนโปรแกรมหาค่า x  ภาษา
 * จัดทำวันที่ 7/25/2023
 */
import java.util.Scanner;

public class PuripongClass3_4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ใส่ค่า a:");
        double a = scanner.nextDouble();

        System.out.println("ใส่ค่า b:");
        double b = scanner.nextDouble();

        System.out.println("ใส่ค่า c:");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("ค่า x1 คือ: " + x1);
            System.out.println("ค่า x2 คือ: " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("มีค่า x เดียว คือ: " + x);
        } else {
            System.out.println("ไม่มีค่า x ที่เป็นไปได้");
        }

        scanner.close();
    }
}
