package src.examples;

public class LicenseKeyFormatting {

    public static StringBuilder trim(StringBuilder s) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < s.length(); index ++) {
            if (s.charAt(index) != '-') {
                result.append(s.charAt(index));
            }
        }
        return result;
    }

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder result = new StringBuilder();
        StringBuilder stringToWorkWith = new StringBuilder();

        for (int index = 0; index < s.length(); index ++) {
            if (s.charAt(index) == '-') {
                stringToWorkWith.append(s, index, s.length());
                result.append('-');
                break;
            } else {
                result.append(s.charAt(index));
            }
        }

        StringBuilder remainingStringWithoutDashes = trim(stringToWorkWith);

        int counter = 0;
        for (int index = 0; index < remainingStringWithoutDashes.length(); index ++) {
            if (counter < k) {
                result.append(remainingStringWithoutDashes.charAt(index));
                counter ++;
            }

            if ((counter == k) && (index != remainingStringWithoutDashes.length()-1)) {
                counter = 0;
                result.append('-');
            }
        }


        System.out.println("String to work with: " + stringToWorkWith);
        System.out.println("First Batch done! Results: " + result);
        return result.toString().toUpperCase();
    }


    public static void main(String[] args) {
        licenseKeyFormatting("2-5g-3-J", 2);
    }
}
