import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณาป้อนคะแนน: ");
        int score = scanner.nextInt();
        scanner.close();

        String grade;
        if (score < 50) {
            grade = "F";
        } else if (score <= 55) {
            grade = "C";
        } else if (score <= 60) {
            grade = "C+";
        } else if (score <= 65) {
            grade = "B";
        } else if (score <= 75) {
            grade = "B+";
        } else {
            grade = "A";
        }

        System.out.println("คุณได้เกรด: " + grade);
    }
}
