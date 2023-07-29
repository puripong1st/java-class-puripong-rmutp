public class Rmutpclass {
    public static void main(String[] args) {
        // สร้างอ็อบเจกต์ของคลาส StudentID
        StudentID student = new StudentID(12345);

        // เรียกใช้เมธอด getID() เพื่อแสดงผลค่า id
        System.out.println("Student ID: " + student.getID());

        // เรียกใช้เมธอด setID() เพื่อเปลี่ยนค่า id
        student.setID(54321);

        // เรียกใช้เมธอด getID() อีกครั้งเพื่อแสดงผลค่า id หลังจากเปลี่ยนค่าแล้ว
        System.out.println("New Student ID: " + student.getID());
    }
}
