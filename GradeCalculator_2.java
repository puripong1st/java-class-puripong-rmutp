import java.util.Scanner;

public class GradeCalculator_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรอกคะแนน: ");
        int score = scanner.nextInt();

        String grade;
        String description;
        int pointsNeeded;
        String gradeNeeded;

        if (score >= 80 && score <= 100) {
            grade = "A";
            description = "Excellent";
            pointsNeeded = 0;
            gradeNeeded = "";
        } else if (score >= 75 && score <= 79) {
            grade = "B+";
            description = "Very Good";
            pointsNeeded = 80 - score;
            gradeNeeded = "A";
        } else if (score >= 70 && score <= 74) {
            grade = "B";
            description = "Good";
            pointsNeeded = 75 - score;
            gradeNeeded = "B+";
        } else if (score >= 65 && score <= 69) {
            grade = "C+";
            description = "Fairly Good";
            pointsNeeded = 70 - score;
            gradeNeeded = "B";
        } else if (score >= 60 && score <= 64) {
            grade = "C";
            description = "Fair";
            pointsNeeded = 65 - score;
            gradeNeeded = "C+";
        } else if (score >= 55 && score <= 59) {
            grade = "D+";
            description = "Poor";
            pointsNeeded = 60 - score;
            gradeNeeded = "C";
        } else if (score >= 50 && score <= 54) {
            grade = "D";
            description = "Very Poor";
            pointsNeeded = 55 - score;
            gradeNeeded = "D+";
        } else {
            grade = "F";
            description = "Fail";
            pointsNeeded = 50 - score;
            gradeNeeded = "D";
        }

        System.out.println("คะแนน: " + score);
        System.out.println("เกรด: " + grade);
        System.out.println("คำอธิบายเกรด: " + description);

        if (score < 80) {
            System.out.println("ขาดอีก " + pointsNeeded + " คะแนนเพื่อได้เกรด " + gradeNeeded);
        }
    }
}
