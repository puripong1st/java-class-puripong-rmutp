/* เขียนโปรแกรมที่ใช้เครื่องหมายต่อไปนี้ครบทุกเครื่องหมาย +, +=, ++, 3 -=, *, *=, และ %
 * จัดทำวันที่ 7/25/2023
 */
public class PuripongClass3_4_7 {
    public static void main(String[] args) {
        int a = 69;
        int b = 20;

        System.out.println(a + b); // 89 (69 + 20)
        System.out.println(a += b); // 89 (a = a + b, 69 + 20, ตัวแปร a จะเปลี่ยนค่าเป็น 89)
        System.out.println(a++); // 89 (a จะเพิ่มค่าขึ้นเป็น 90 หลังจากนั้นแสดงค่า a ก่อนเพิ่มค่า)
        System.out.println(a - b); // 70 (90 - 20)
        System.out.println(a -= b); // 70 (a = a - b, 90 - 20, ตัวแปร a จะเปลี่ยนค่าเป็น 70)
        System.out.println(a * b); // 1400 (70 * 20)
        System.out.println(a *= b); // 1400 (a = a * b, 70 * 20, ตัวแปร a จะเปลี่ยนค่าเป็น 1400)
        System.out.println(a % b); // 0 (1400 mod 20, หาผลลัพธ์ของการหารเอาเศษ)
    }
}
