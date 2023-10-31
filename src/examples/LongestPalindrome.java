package src.examples;

public class LongestPalindrome {

    public static String longestPalindromeSubString(String str) {
        String longestPalindrome = "";

        for (int i = 0; i < str.length(); i ++) {
            for (int j = i; j < str.length(); j ++) {
                String substring = str.substring(i, j + 1);
                if (substring.length() > longestPalindrome.length() && isPalindrome(substring)) {
                    longestPalindrome = substring;
                }
            }
        }
        return longestPalindrome;
    }

    public static boolean isPalindrome(String subString) {
        int leftIdx = 0;
        int rightIdx = subString.length();
        while (leftIdx < rightIdx) {
            if (subString.charAt(leftIdx) == subString.charAt(rightIdx)) {
                leftIdx ++;
                rightIdx --;
            } else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

    }
}
