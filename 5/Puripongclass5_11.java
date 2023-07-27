public class Puripongclass5_11 {
    public static void main(String[] args) {
        int n = 30;
        long factorial = calculateFactorial(n);

        System.out.println("Factorial ของ " + n + " คือ " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
