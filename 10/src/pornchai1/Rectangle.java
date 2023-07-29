package pornchai1;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "Rectangle - Width: " + width + ", Height: " + height;
    }

    // เพิ่มเมธอด getTotalSides() คืนค่าจำนวนด้านของสี่เหลี่ยม (ในกรณีนี้คืนค่าเสมอเป็น 4)
    public static int getTotalSides() {
        return 5;
    }
}
