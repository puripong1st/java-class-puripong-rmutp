import java.util.ArrayList;

public class Puripongclass11_3 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        // เพิ่มสตริงลงในลิสต์ด้วยเมธอด add()
        stringList.add("Pornchai");
        stringList.add("Montree");
        stringList.add("Umpaporn");

        // ใช้เมธอด set() เพื่อแทรกคำว่า "Theera" ลงในตำแหน่งที่ 1
        stringList.add(1, "Theera");

        // พิมพ์ลิสต์ออกทางหน้าจอ
        System.out.println(stringList);
    }
}
