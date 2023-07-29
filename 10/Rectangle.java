public class Rectangle {
    private double width;
    private double height;
    private Color color; // เพิ่มตัวแปรสี

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // เพิ่มตัวเลือกในการกำหนดสี
    public void setColor(Color color) {
        this.color = color;
    }

    // เพิ่มเมธอดในการคืนค่าสี
    public Color getColor() {
        return color;
    }

    public String toString() {
        return "Rectangle - Width: " + width + ", Height: " + height + ", Color: " + color;
    }
}
