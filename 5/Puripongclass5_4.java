public class Puripongclass5_4 {
    public static void main(String[] args) {
        int[] numbers = { 21, 15, 30, 18, 22, 33 };
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                System.out.println(min);
            }
        }

    }
}
