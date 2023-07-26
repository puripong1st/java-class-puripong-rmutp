import java.util.Scanner;

public class Puripongclass4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double pi = 3.14;
        System.out.print("พื้นที่ของวงกลม : ");
        double pro1 = sc.nextInt();
        double pro3 = Math.pow(pro1, 2);
        double pro2 = pi * pro3;

        System.out.println("พื้นที่ของวงกลม : " + pro2);
    }
}
