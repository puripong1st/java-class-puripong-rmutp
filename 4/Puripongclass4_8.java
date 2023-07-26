public class Puripongclass4_8 {
    public static void main(String[] args) {
        // เกรดแต่ละวิชา
        char grade1 = 'A';
        char grade2 = 'A';
        char grade3 = 'A';
        char grade4 = 'B';
        char grade5 = 'C';
        char grade6 = 'C';
        char grade7 = 'C';

        // หน่วยกิตของแต่ละวิชา
        int credit1 = 3;
        int credit2 = 3;
        int credit3 = 3;
        int credit4 = 2;
        int credit5 = 1;
        int credit6 = 1;
        int credit7 = 1;

        // คำนวณเกรดเฉลี่ย (GPA)
        double totalCredits = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7;
        double totalGradePoints = getGradePoint(grade1) * credit1 + getGradePoint(grade2) * credit2 +
                getGradePoint(grade3) * credit3 + getGradePoint(grade4) * credit4 +
                getGradePoint(grade5) * credit5 + getGradePoint(grade6) * credit6 +
                getGradePoint(grade7) * credit7;

        double gpa = totalGradePoints / totalCredits;
        System.out.println("เกรดเฉลี่ยของนักเรียนคือ: " + gpa);
    }

    // เมธอดสำหรับคืนค่าคะแนนเกรด (Grade Point) ของแต่ละเกรด
    public static double getGradePoint(char grade) {
        switch (grade) {
            case 'A':
                return 4.0;
            case 'B':
                return 3.0;
            case 'C':
                return 2.0;
            case 'D':
                return 1.0;
            case 'F':
                return 0.0;
            default:
                return 0.0; // หากไม่ใช่เกรดที่กำหนด ให้คืนค่า 0.0
        }
    }
}