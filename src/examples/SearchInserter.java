package src.examples;

public class SearchInserter {
    public static int searchInsert(int[] num, int target) {
        int left = 0;
        int right = num.length - 1;
        int leftValue;
        int rightValue;
        int mid = 0;
        int midValue;

        if (num.length == 0) return 0;

        while (left <= right) {
            leftValue = num[left];
            rightValue = num[right];
            mid = Math.floorDiv(left + right, 2);
            midValue = num[mid];

            if (target < midValue) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return mid;
    }

    public static void main(String[] args) {
        int[] sorted = {1, 2, 3, 4, 5, 6};
        System.out.println(searchInsert(sorted, 6));
    }
}
