public class PHelloRMUTP {
    // Public method ที่ใช้สำหรับแสดงข้อความ "Hello RMUTP!"
    public void printHello() {
        System.out.println("Hello RMUTP!");
    }

    public static void main(String[] args) {
        // สร้างอ็อบเจกต์ของคลาส PHelloRMUTP
        PHelloRMUTP myObject = new PHelloRMUTP();

        // เรียกใช้ public method printHello()
        myObject.printHello();
    }
}
