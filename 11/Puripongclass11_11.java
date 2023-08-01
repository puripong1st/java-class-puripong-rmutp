// สร้าง enum Day ที่เก็บวันอาทิตย์ถึงวันเสาร์
enum Day {
    SUNDAY("Sun"), MONDAY("Mon"), TUESDAY("Tue"), WEDNESDAY("Wed"), THURSDAY("Thu"), FRIDAY("Fri"), SATURDAY("Sat");

    private String abbreviation;

    // กำหนดคำย่อของวัน
    Day(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    // เมธอดส่งคืนคำย่อของวัน
    public String Abbreviation() {
        return abbreviation;
    }
}

public class Puripongclass11_11 {
    public static void main(String[] args) {
        // พิมพ์คำย่อของวันอาทิตย์ถึงวันเสาร์ออกทางหน้าจอ
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.Abbreviation());
        }
    }
}
