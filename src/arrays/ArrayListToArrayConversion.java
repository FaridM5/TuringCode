package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArrayConversion {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        int[] streamConversion = myArrayList.stream().mapToInt(i -> i).toArray();

        System.out.println("Conversion using Stream: " + Arrays.toString(streamConversion));

        int[] manualConversion = new int[myArrayList.size()];

        for (int i = 0; i < manualConversion.length; i++) {
            manualConversion[i] = myArrayList.get(i);
        }

        System.out.print("Manual Conversion: " + Arrays.toString(manualConversion));
    }
}
