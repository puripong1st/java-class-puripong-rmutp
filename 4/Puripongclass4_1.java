
/* เขียนโปรแกรมคำนวณค่าจ้างโดยใช้คำสั่ง if ถ้าทำงานไม่เกิน 160 ชั่วโมงต่อสัปดาห์ 
 * บริษัทจะจ้างในอัตราชั่วโมงละ 100 บาท แต่ถ้าทำงานเกิน 160 ชม จะได้ค่าล่วงเวลาในอัตตรา 150 บาท
 * ต่อชั่วโมง ตัวอย่างเช่น
 * คนทำงาน 100 ชม ก็จะได้เงินเดือนเท่ากับ 100x160 = 16000 B
 * คนทำงาน 70 ชม ก็จะได้เงินเดือนเท่ากับ (100x160) + (10x150 = 17500) B
 * จัดทำวันที่ 26/7/2023
 */
import java.util.Scanner;

public class Puripongclass4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("คุณทำงานกี่ชั่วโมงต่อสัปดาห์: ");
        int totalHours = scanner.nextInt();
        scanner.close();

        int hourweek = 160;
        int hourrate = 100;
        int overtimerate = 150;
        int regularPay = 0;
        int overtimePay = 0;

        if (totalHours <= hourweek) {
            regularPay = totalHours * hourrate;
        } else {
            regularPay = hourweek * hourrate;
            overtimePay = (totalHours - hourweek) * overtimerate;
        }

        int totalSalary = regularPay + overtimePay;
        System.out.println("ค่าจ้างรายสัปดาห์: " + totalSalary + " บาท");

    }
}