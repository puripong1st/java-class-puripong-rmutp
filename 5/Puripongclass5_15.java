import java.util.Scanner;

public class Puripongclass5_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรอกค่ารัศมีของวงกลม: ");
        double radius = scanner.nextDouble();

        double area = calculateCircleArea(radius);

        System.out.println("พื้นที่ของวงกลมคือ: " + area);
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
