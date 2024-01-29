package lesson_7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] numbers2 = {1, 2, 3, 4};

        int[][] twoDArray = new int[5][3];
        // 1, 2, 3
        // 0, 0, 0, 0
        // 5, 6, 5, 5
        // 0, 0, 0, 0, 9, 10
        // 0, 0, 0, 0
        // 0 -> {1,2,3}
        // 1 -> {5,6,3}
        twoDArray[0] = new int[]{1, 2, 3, 4};
        twoDArray[1] = new int[]{5, 6, 3};
        twoDArray[2] = new int[]{5, 6, 3};
        twoDArray[3] = new int[]{5, 6};

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(twoDArray[2]));
        System.out.println(Arrays.deepToString(twoDArray));
        int[] testSort = {1, 5, 3, 5, 10};
        System.out.println(Arrays.toString(testSort));
        Arrays.sort(testSort);
        System.out.println(Arrays.toString(testSort));

    }
}
