import java.util.Scanner;

public class Puripongclass4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ด้านคู่ขนาน 1 : ");
        int p1 = sc.nextInt();
        System.out.print("ด้านคู่ขนาน 2 : ");
        int p2 = sc.nextInt();

        System.out.print("ระยะห่างระหว่างเส้นคู่ขนาน : ");
        int p4 = sc.nextInt();

        double slantHeight = Math.sqrt(p4 * p4 + Math.pow((p2 - p1) / 2, 2));

        double area = 0.5 * (p1 + p2) * slantHeight;

        System.out.println("พื้นที่ของสี่เหลี่ยมคางหมูคือ: " + area);

        sc.close();
    }
}
