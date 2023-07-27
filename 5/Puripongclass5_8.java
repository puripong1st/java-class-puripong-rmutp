public class Puripongclass5_8 {
    public static void main(String[] args) {
        int[][] array = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int sum = sumTwoDimensionalArray(array);

        System.out.println("ผลรวมของเลขในอาร์เรย์: " + sum);
    }

    public static int sumTwoDimensionalArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
