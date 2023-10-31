package src.examples;

public class TwoPointerExample {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int target = 5;
        int result[][] = new int[1][1];

        for (int i = 0; i < arr.length; i ++ ) {
            for (int j = i; j < arr.length; j ++) {
                if (arr[i] + arr[j] == target) {
                    result[0][1] = arr[i];
                }
            }
        }
    }
}
