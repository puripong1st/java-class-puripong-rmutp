import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BingoGame {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);

        int[][] bingoTable = new int[5][5];

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                bingoTable[row][col] = numbers.remove(0);
            }
        }

        // กำหนดช่องตรงกลางฟรี
        bingoTable[2][2] = -1;

        // แสดงผลตารางบิงโก
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (bingoTable[row][col] == -1) {
                    System.out.print("  FREE  ");
                } else {
                    System.out.printf("%6d ", bingoTable[row][col]);
                }
            }
            System.out.println();
        }
    }
}
