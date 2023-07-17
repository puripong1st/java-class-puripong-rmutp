import java.util.Scanner;

public class Puripongclasstwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // รับค่า
        //การคูณแม่
        int start = 2;
        int end = 12; 
        //คูณส่วนสอง
        int start_2 = 1;
        int end_2 = 12;
        

        for (int i = start; i <= end; i++) { // ทำงานวนลูป
            System.out.println("แม่ " + i + " :"); // print บอกแม่ 
            for (int j = start_2; j <= end_2; j++) { // ทำงานวนลูป
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("-----------------------");
            System.out.println("กด Enter เพื่อไปแม่ต่อไป ");
            scanner.nextLine(); // ใช้ scanner เพื่อไปแม่ถัดไป
        }
        scanner.close(); //ปิดการทำงานเมื่อทำงานเสร็จสิ้น
    }
}
