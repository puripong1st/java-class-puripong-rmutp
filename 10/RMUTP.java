import java.awt.Color; // นำเข้าคลาส Color จาก package java.awt
import somying.shape.Rectangle;

public class RMUTP {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0, 10.0);
        Rectangle r2 = new Rectangle(7.0, 12.0);

        r1.setColor(Color.RED); // กำหนดสีสี่เหลี่ยม r1 เป็นสีแดง
        r2.setColor(Color.BLUE); // กำหนดสีสี่เหลี่ยม r2 เป็นสีน้ำเงิน

        System.out.println(r1);
        System.out.println(r2);
    }
}
