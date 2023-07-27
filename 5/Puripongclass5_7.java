public class Puripongclass5_7 {
    public static void main(String[] args) {
        int[][] array = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int target = 4;

        int[] position = findPosition(array, target);

        if (position != null) {
            System.out.println("เลข " + target + " พบในอาร์เรย์ที่ตำแหน่ง: [" + position[0] + "][" + position[1] + "]");
        } else {
            System.out.println("ไม่พบเลข " + target + " ในอาร์เรย์");
        }
    }

    public static int[] findPosition(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}
