enum Month_1 {
    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31),
    AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

    private int days;

    // กำหนดจำนวนวันในแต่ละเดือน
    Month_1(int days) {
        this.days = days;
    }

    // เมธอดส่งคืนจำนวนวันในเดือน
    public int numberOfDays() {
        return days;
    }
}

public class Puripongclass11_8 {
    public static void main(String[] args) {
        // พิมพ์ชื่อเดือนพร้อมจำนวนวันทั้ง 12 เดือนออกทางหน้าจอ
        for (Month_1 month : Month_1.values()) {
            System.out.println(month + ": " + month.numberOfDays() + " days");
        }
    }
}
