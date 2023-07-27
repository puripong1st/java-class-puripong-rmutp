public class Puripongclass5_5 {
    public static void main(String[] args) {
        int[] numbers = { 21, 15, 30, 18, 22, 33 };
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println("ค่าเฉลี่ยของตัวเลขในอาร์เรย์คือ: " + average);
    }

}
