package mypackage;

import static pornchai1.Rectangle.getTotalSides;
import pornchai1.Rectangle;
import siriporn.Rectangle;

public class TesttwoRectangle {
    public static final double PI = 3.14159; // เพิ่มค่าคงที่ PI

    public static void main(String[] args) {
        pornchai1.Rectangle rect1 = new pornchai1.Rectangle(5.0, 10.0);
        siriporn.Rectangle rect2 = new siriporn.Rectangle(7.0, 12.0);

        System.out.println(rect1.toString());
        System.out.println(rect2.toString());

        System.out.println("PI Value: " + PI); // แสดงค่าคงที่ PI
        System.out.println("Total sides of Rectangle from pornchai1: " + getTotalSides()); // เรียกใช้เมธอดโดยไม่ต้องพิมพ์ชื่อคลาส

    }
}
