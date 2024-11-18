package arrays;

import java.util.Arrays;

class Names {
    String firstName;
    String lastName;

    Names(String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
    }
}

public class ArrayDecleration {
    public static void main(String[] args) {

        // Simple array declaration 1 dimensional
        int[] myArr;
        myArr = new int[10];

        int[] myArray1 = new int[10];

        int[] myArray3 = new int[]{1, 2, 3, 4, 5, 6};

        // Simple array declaration 2 dimensional
        int[][] myArray4 = new int[3][]; // there we should define at least the first row to avoid error

        int[][] myArray5 = new int[3][];

        int[][] myArray6 = new int[][]{{1, 2, 3}, {4, 5, 6}};

        // Demonstration of JAGGED ARRAY
        myArray5[0] = new int[]{1, 2};
        myArray5[1] = new int[]{1, 2, 3, 4};

        // Simple array declaration 3 dimensional
        int[][][] myArray7 = new int[][][]{{{1, 2}, {3, 4}},
                {{5, 6}},
                {{7, 8}}};

        //this two defines that the array should include 2D arrays
        int[][][] myArray8 = new int[2][][];
        myArray8[0] = new int[][]{{1, 2}, {3, 4}};
        myArray8[1] = new int[][]{{5,6}, {7,8}};

        System.out.println(myArray8[0][0][1]);

        // How arrays behave in memory
        Names firstPerson = new Names("John", "Doe");
        Names secondPerson = new Names("Alex", "Smith");

        // this will store the references to the objects
        Names[] peopleArray = {firstPerson, secondPerson};

        // Different way to initialize
        Names[] peopleArrays2 = new Names[]{new Names("Emma", "Johnson"), new Names("Jack", "Smith"), new Names("Liam", "Brown")};

        System.out.println(Arrays.toString(peopleArray));
        System.out.println(Arrays.toString(peopleArrays2));

        System.out.println(peopleArray[0]);
        System.out.println(peopleArray[1]);

        // this will go and find the object with specific reference so that it can take firstName out from the object
        System.out.println(peopleArray[0].firstName);
        System.out.println(peopleArray[1].firstName);

        // this will store the values themselves
        int[] intArray = {1, 2, 3};
        System.out.println(Arrays.toString(intArray));


//         Initialization below is not right based on the rules defined by JAVA
//
//        int[][][] arr3 = new int[4][3][2]{{{1,2}, {3,4}, {5,6}}, {{7,8}, {9,10}, {11,12}}, {{13,14}, {15,16}, {17,18}},
//            {{19,20}, {21,22}, {23,24}}};

        int[][][] arr4 = {{{1,2}, {3,4}, {5,6}}, {{7,8}, {9,10}, {11,12}}, {{13,14}, {15,16}, {17,18}},
                {{19,20}, {21,22}, {23,24}}};

//        int[][] arr5 = new int[4][3]{{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};


        int[][][] arr6 = new int[4][3][2];

        arr6[0] = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        arr6[1] = new int[][]{{7, 8}, {9, 10}, {11, 12}};
        arr6[2] = new int[][]{{13, 14}, {15, 16}, {17, 18}};
        arr6[3] = new int[][]{{19, 20}, {21, 22}, {23, 24}};

    }
}
