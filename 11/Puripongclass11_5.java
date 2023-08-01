import java.util.ArrayList;

public class Puripongclass11_5 {
    public static void main(String[] args) {
        ArrayList<StringBuffer> stringList = new ArrayList<>();

        // เพิ่มสตริงบัฟเฟอร์ลงในลิสต์ด้วยเมธอด add()
        stringList.add(new StringBuffer("Pornchai"));
        stringList.add(new StringBuffer("Montree"));
        stringList.add(new StringBuffer("Umpaporn"));

        // ใช้ลูป for เพื่อเติมคำว่า "RMUTP" ต่อท้ายสตริงบัฟเฟอร์ที่อยู่ในลิสต์ทุกตัว
        for (StringBuffer sb : stringList) {
            sb.append(" RMUTP");
        }

        // พิมพ์ค่าในลิสต์ออกทางหน้าจอด้วยลูป for
        for (StringBuffer sb : stringList) {
            System.out.println(sb);
        }
    }
}
