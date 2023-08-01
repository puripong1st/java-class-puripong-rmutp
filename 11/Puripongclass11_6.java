public class Puripongclass11_6 {
    public static void main(String[] args) {
        
    try {
        int result = 7 / 0;
        System.out.println("Result: " + result); // บรรทัดนี้ไม่ถูกทำงานเนื่องจากเกิด ArithmeticException ก่อนหน้านี้
    } catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
        e.printStackTrace();
    }
}
}
