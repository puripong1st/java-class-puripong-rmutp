import java.util.Random;

public class Puripongclass5_13 {
    public static void main(String[] args) {
        Random random = new Random();

        int diceResult = random.nextInt(6) + 1;
        System.out.println("ผลลัพธ์ที่ได้จากการทอยลูกเต๋าคือ: " + diceResult);
    }
}