package lineardatastructures.searchalgorithms;

import lineardatastructures.singlelinkedlist.SingleLinkedList;

public class BinarySearch {

    public static int executeBinarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length;

        while (right > left) {
            int mid = Math.floorDiv(right + left, 2);
            int midValue = array[mid];

            if (target == midValue) {
                return mid;
            } else if (target > midValue) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        int[] searchable = {1, 2, 7, 8, 22, 28, 41, 58, 67, 71, 94};
        int target = 7;

        System.out.println(BinarySearch.executeBinarySearch(searchable, target));

    }

}
