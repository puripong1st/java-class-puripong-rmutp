import java.util.Random;

public class Puripongclass5_14 {
    public static void main(String[] args) {
        Random random = new Random();

        int sum = 0;

        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(100);
            sum += randomNumber;
        }

        double average = (double) sum / 100;

        System.out.println("ค่าเฉลี่ยของการสุ่มเลขระหว่าง 0 - 99 จำนวน 100 ครั้ง: " + average);
    }
}
