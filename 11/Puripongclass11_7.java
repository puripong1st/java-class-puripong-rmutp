// สร้าง enum Month ที่เก็บชื่อเดือนตั้งแต่เดือนมกราคมจนถึงเดือนธันวาคม
enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

public class Puripongclass11_7 {
    public static void main(String[] args) {
        // พิมพ์ชื่อเดือนทั้ง 12 เดือนออกทางหน้าจอ
        for (Month month : Month.values()) {
            System.out.println(month);
        }
    }
}
