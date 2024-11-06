package leetcode;

import java.util.Scanner;

public class SmallestEven {
    public static int smallestEvenMultiple(int n) {
        return (n % 2 == 0) ? n : n * 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(smallestEvenMultiple(n));
    }
}
