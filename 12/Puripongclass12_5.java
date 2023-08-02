public class Puripongclass12_5 {
    public static void main(String[] args) {
        double radius = 5; // รัศมีของวงกลม

        double area = calculateCircleArea(radius);

        System.out.println("พื้นที่ของวงกลมรัศมี " + radius + " หน่วย คือ " + area);
    }

    public static double calculateCircleArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
