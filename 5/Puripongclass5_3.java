public class Puripongclass5_3 {
    public static void main(String[] args) {
        int[] numbers = { 21, 15, 30, 18, 22, 33 };

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 == 1) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

}
