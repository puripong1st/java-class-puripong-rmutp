public class Puripongclass4_5 {
    public static void main(String[] args) {
        System.out.println("จำนวนเต็มบวกที่หาร 36 ลงตัวคือ:");

        for (int number = 1; number <= 36; number++) {
            if (36 % number == 0) {
                System.out.println(number);
            }
        }
    }
}
