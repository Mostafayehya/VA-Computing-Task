package com.MinMaxMatrix;

public class Main {

    public static void main(String[] args) {
        System.out.println(locateMinMax(new int[]{3, 4, 6, 2, 8, 1, 4, 0, 4}));
    }

    public static String locateMinMax(int[] matrix) {

        int minIndex = 0, maxIndex = 0, minRow, minCol, maxRow, maxCol;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] > max) {
                max = matrix[i];
                maxIndex = i;
            }

            if (matrix[i] < min) {
                min = matrix[i];
                minIndex = i;
            }
        }

        minRow = (minIndex / 3) + 1;
        minCol = (minIndex % 3) + 1;

        maxRow = (maxIndex / 3) + 1;
        maxCol = (maxIndex % 3) + 1;

        return "The min is " + min + " (index " + minIndex + ", row " + minRow + ", col " + minCol + ")" +
                " and max is " + max + " (index " + maxIndex + ", row " + maxRow + ", col " + maxCol + ")";

    }
}
