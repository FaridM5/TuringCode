package leetcode;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reversed = 0;
        int remainingValue = x;
        while (remainingValue != 0) {
            reversed = (remainingValue % 10) + reversed * 10;
            remainingValue /= 10;
        }
        return reversed == x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(isPalindrome(n));
    }
}
