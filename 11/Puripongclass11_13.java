// สร้าง enum Continent ที่เก็บชื่อทวีปต่างๆ
enum Continent {
    AFRICA(30370000), ANTARCTICA(14000000), ASIA(44579000), EUROPE(10180000),
    NORTH_AMERICA(24709000), OCEANIA(8567000), SOUTH_AMERICA(17840000);

    private int area;

    // กำหนดพื้นที่ให้กับทวีป
    Continent(int area) {
        this.area = area;
    }

    // เมธอดส่งคืนพื้นที่ของทวีป
    public int getArea() {
        return area;
    }
}

public class Puripongclass11_13 {
    public static void main(String[] args) {
        // ทดลองใช้เมธอดใน enum Continent
        for (Continent continent : Continent.values()) {
            System.out.println(continent + ": Area = " + continent.getArea() + " square kilometers");
        }
    }
}
