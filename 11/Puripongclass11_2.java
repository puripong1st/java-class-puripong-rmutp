import java.util.ArrayList;

public class Puripongclass11_2 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        // เพิ่มสตริงลงในลิสต์ด้วยเมธอด add()
        stringList.add("Pornchai");
        stringList.add("Montree");
        stringList.add("Umpaporn");

        // ใช้เมธอด set() เพื่อเปลี่ยนค่าในตำแหน่งที่ 2 เป็น "Suschada"
        stringList.set(1, "Suchada");

        // พิมพ์ลิสต์ออกทางหน้าจอ
        System.out.println(stringList);

    }
}
