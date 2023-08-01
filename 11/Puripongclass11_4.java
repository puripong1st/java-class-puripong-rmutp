import java.util.ArrayList;

public class Puripongclass11_4 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        // เพิ่มสตริงลงในลิสต์ด้วยเมธอด add()
        stringList.add("Pornchai");
        stringList.add("Montree");
        stringList.add("Umpaporn");

        // ใช้เมธอด contains() เพื่อตรวจสอบว่ามีคำว่า "Montree" อยู่ในลิสต์หรือไม่
        boolean containsMontree = stringList.contains("Montree");
        
        // พิมพ์ผลการตรวจสอบออกทางหน้าจอ
        System.out.println("Contains Montree: " + containsMontree);
    }
}
