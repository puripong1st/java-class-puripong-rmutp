public class Puripongclass11_10 {
    public static void main(String[] args) {
        Grade[] MyGrades = {Grade.B, Grade.A, Grade.D};
        int[] myCredits = {3, 3, 2};

        double totalCredits = 0;
        double totalPoints = 0;

        // คำนวณเกรดเฉลี่ย
        for (int i = 0; i < MyGrades.length; i++) {
            totalCredits += myCredits[i];
            totalPoints += MyGrades[i].getPoints() * myCredits[i];
        }

        double gpa = totalPoints / totalCredits;
        System.out.println("GPA: " + gpa);
    }
}
