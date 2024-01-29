package lesson_7;

public class TwoDArrayPractice {
    public static void main(String[] args) {
        int[][] twoDArray = new int[5][5];
        twoDArray[0] = new int[]{1, 2, 3, 4, -5}; // [0][4]
        twoDArray[1] = new int[]{5, 9, 3, 10, 2}; // [1][3]
        twoDArray[2] = new int[]{5, 6, 3, -4, 3}; // [2][2]
        twoDArray[3] = new int[]{8, 9, 1, -2, -5}; // [3][1]
        twoDArray[4] = new int[]{1, 12, -3, 1, 6}; // [4][0]

        // Print numbers from the diagonal starting top left, ending bot right
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                if (i == j) {
                    System.out.println(twoDArray[i][j]);
                }
            }
        }
        System.out.println("-----------");
        // Print numbers from the diagonal starting top right, ending bot left
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                if (twoDArray[i].length - 1  == j + i) {
                    System.out.println(twoDArray[i][j]);
                }
            }
        }
    }
}
