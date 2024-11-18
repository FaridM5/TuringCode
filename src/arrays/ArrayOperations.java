package arrays;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        // Iterating through array (1 Dimensional)

        int[] array1 = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        // Enhanced for loop
        for (int k : array1) {
            System.out.println(k);
        }

        // Iterating through array (2 Dimensional)
        int[][] array2 = new int[][]{{1,2,3},{4,5,6}};
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println(array2[i][j]);
            }
        }

        // Filling up an array with a specific value
        int[] arrayFill = new int[5];
        Arrays.fill(arrayFill, 10);
        System.out.println(Arrays.toString(arrayFill));

        // Finding max in an array
        int[] findMax = new int[]{1,2,3,4,5};
        int maxValue = Arrays.stream(findMax).max().getAsInt();
        System.out.println(maxValue);

    }
}
