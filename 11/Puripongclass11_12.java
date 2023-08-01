// สร้าง enum Color ที่เก็บสีประจำวัน
enum Color {
    White, Gray, Red, Yellow, Green, SkyBlue, Blue, Pink, Purple, Orange
}

// สร้าง enum Day ที่เก็บวันอาทิตย์ถึงวันเสาร์
enum Day_1 {
    SUNDAY(Color.Red), MONDAY(Color.Yellow), TUESDAY(Color.Green), WEDNESDAY(Color.SkyBlue),
    THURSDAY(Color.Blue), FRIDAY(Color.Pink), SATURDAY(Color.Purple);

    private Color color;

    // กำหนดสีประจำวัน
    Day_1(Color color) {
        this.color = color;
    }

    // เมธอดส่งคืนสีประจำวัน
    public Color getColor() {
        return color;
    }
}

public class Puripongclass11_12{
    public static void main(String[] args) {
        // พิมพ์วันทั้งหมดพร้อมทั้งสีประจำวันออกทางหน้าจอ
        for (Day_1 day : Day_1.values()) {
            System.out.println(day + ": " + day.getColor());
        }
    }
}
