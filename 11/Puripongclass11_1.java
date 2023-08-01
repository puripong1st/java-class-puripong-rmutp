import java.util.ArrayList;

public class Puripongclass11_1 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        // เพิ่มสตริงลงในลิสต์ด้วยเมธอด add()
        stringList.add("Pornchai");
        stringList.add("Montree");
        stringList.add("Umpaporn");

        // พิมพ์ค่าในลิสต์ด้วยลูป for
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
