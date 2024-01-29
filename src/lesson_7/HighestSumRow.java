package lesson_7;

public class HighestSumRow {
    public static void main(String[] args) {
        int[][] temperaturesPerDay = new int[5][6];
        temperaturesPerDay[0] = new int[]{1, 2, 3, 4, -5, 10};
        temperaturesPerDay[1] = new int[]{5, 9, 3, 10, 2, 5};
        temperaturesPerDay[2] = new int[]{5, 6, 3, -4, 3, 2};
        temperaturesPerDay[3] = new int[]{8, 9, 1, -2, -5, 3};
        temperaturesPerDay[4] = new int[]{1, 13};

        double min = Double.MAX_VALUE;
        int dayIndex = -1;
        for (int i = 0; i < temperaturesPerDay.length; i++) {
            double sum = 0;
            for (int j = 0; j < temperaturesPerDay[i].length; j++) {
                sum += temperaturesPerDay[i][j];
            }
            double dayAvg = sum / temperaturesPerDay[i].length;
            if (dayAvg < min) {
                min = dayAvg;
                dayIndex = i;
            }
        }
        if (dayIndex != -1) {
            System.out.println("Day " + (dayIndex + 1) + " had the lowest avg temp: " + min);
        }
    }
}
