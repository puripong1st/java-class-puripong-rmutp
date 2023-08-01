// สร้าง enum Grade ที่เก็บชื่อเกรดและแต้มระดับคะแนน
enum Grade {
    A(4.0), B_Plus(3.5), B(3.0),
    C_Plus(2.5), C(2.0), D_Plus(1.5), D(1.0), F(0.0);

    private double points;

    // กำหนดแต้มระดับคะแนนในแต่ละเกรดw
    Grade(double points) {
        this.points = points;
    }

    // เมธอดส่งคืนแต้มระดับคะแนน
    public double getPoints() {
        return points;
    }
}

public class Puripongclass11_9 {
    public static void main(String[] args) {
        // พิมพ์เกรดทั้งหมดพร้อมแต้มระดับคะแนนออกทางหน้าจอ
        for (Grade grade : Grade.values()) {
            System.out.println(grade + ": " + grade.getPoints() + " points");
        }
    }
}
