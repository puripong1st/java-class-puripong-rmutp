import java.util.Scanner;

public class Puripongclass12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("กด Enter เพื่อแสดงตารางสูตรคูณ (หรือ 0 เพื่อออก)");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("0")) {
                System.out.println("ออกจากโปรแกรม");
                break; // ปิดการทำงานเมื่อกด 0
            } else if (input.isEmpty()) {
                displayMultiplicationTable();
            } else {
                System.out.println("กด Enter เพื่อแสดงตารางสูตรคูณ (หรือ 0 เพื่อออก)");
            }
        }

        scanner.close();
    }

    public static void displayMultiplicationTable() {
        for (int i = 2; i <= 12; i++) {
            System.out.println("สูตรคูณแม่ " + i + ":");
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
            System.out.println("กด Enter เพื่อแสดงตารางสูตรคูณถัดไป (หรือ 0 เพื่อออก)");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("0")) {
                System.out.println("ออกจากโปรแกรม");
                System.exit(0); // ปิดการทำงานทันทีเมื่อกด 0
            }
        }
    }
}
