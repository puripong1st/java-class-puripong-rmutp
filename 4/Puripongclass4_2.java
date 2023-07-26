import java.util.Scanner;

public class Puripongclass4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("เกรดของคุณ : ");
        int grad = sc.nextInt();

        switch (grad) {
            case 0:
                System.out.println("เกรดของคุณแย่");
                break;
            case 1:
                System.out.println("เกรดของคุณค่อนข้างแย่");
                break;
            case 2:
                System.out.println("เกรดของคุณดี");
                break;
            case 3:
                System.out.println("เกรดของคุณค่อนข้างดี");
                break;
            case 4:
                System.out.println("เกรดของคุณค่อนข้างดีเยี่ยม");
                break;
            default:
                System.out.println("ไม่พบเกรดในระบบกรอกใหม่อีกครั้ง");
        }
        sc.close();
    }
}
