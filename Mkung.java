public class Mkung {
    public static void main(String[] args) {
        int start = 2;
        int end = 15;

        for (int i = start; i <= end; i++) {
            System.out.println("สูตรคูณของ " + i + ":");
            for (int j = 1; j <= 12; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }
            System.out.println();
        }
    }
}
