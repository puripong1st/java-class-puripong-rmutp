public class Puripongclass5_9 {
    public static void main(String[] args) {
        int[][] matrixA = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        int[][] matrixB = {
                { 7, 8 },
                { 9, 10 },
                { 11, 12 }
        };

        // คำนวณผลลัพธ์เมตริกซ์
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrixA[i][0] * matrixB[0][j] + matrixA[i][1] * matrixB[1][j]
                        + matrixA[i][2] * matrixB[2][j];
            }
        }

        // พิมพ์ผลลัพธ์ของเมตริกซ์ที่คูณกันออกทางหน้าจอ
        System.out.println("ผลลัพธ์ของเมตริกซ์ที่คูณกันคือ: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
