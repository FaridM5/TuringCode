package leetcode;

import java.util.Scanner;

public class RansomNote {

    /**
     * Ransom Note Problem First Approach
     *<br><br>
     * Problem link: <a href="https://leetcode.com/problems/ransom-note/description/">Ransom Note</a>
     * <br><br>My success rate: 62.92%
     *
     * @author Farid Mammadli
     * @version 1
     */
    public static boolean canConstructV1(String ransomNote, String magazine) {
        char[] ransomNoteCharArray = ransomNote.toCharArray();
        char[] magazineCharArray = magazine.toCharArray();

        int successChecker = 0;
        for (int i = 0; i < ransomNoteCharArray.length; i++) {
            for (int j = 0; j < magazineCharArray.length; j++) {
                if (ransomNoteCharArray[i] == magazineCharArray[j]) {
                    magazineCharArray[j] = '@';
                    successChecker++;
                    break;
                }
            }
        }
        return successChecker == ransomNoteCharArray.length;
    }

    /**
     * Ransom Note Problem Second Approach
     *<br><br>
     * Problem link: <a href="https://leetcode.com/problems/ransom-note/description/">Ransom Note</a>
     * <br><br>My success rate: 83.86%
     *
     * @author Farid Mammadli
     * @version 2
     */
    public static boolean canConstructV2(String ransomNote, String magazine) {
        char[] ransomNoteCharArray = ransomNote.toCharArray();

        StringBuilder magazineString = new StringBuilder(magazine);
        for (char c : ransomNoteCharArray) {
            int charIndex = magazineString.indexOf(String.valueOf(c));
            if(charIndex != -1) {
                magazineString.deleteCharAt(charIndex);
            }else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ransomNote = sc.next();
        String magazine = sc.next();

        System.out.print(canConstructV2(ransomNote, magazine));
    }
}
