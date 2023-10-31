package src.examples;

public class LengthOfLongestSubstring {

    public static int LongestSubstring(String s) {
        StringBuilder longestString = new StringBuilder();
        StringBuilder currentLongestString = new StringBuilder();

        for (int i = 0; i < s.length(); i ++) {
            for (int j = i; j < s.length(); j ++) {
                if (s.charAt(i) != s.charAt(j)) {
                    currentLongestString.append(s.charAt(i));
                } else if (currentLongestString.length() > longestString.length()){

                }
            }
        }
        return 0;
    }
}
