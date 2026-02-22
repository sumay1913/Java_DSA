// Problem: Peak Index in Mountain Array
// Platform: LeetCode
// Topic: Arrays / Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class PeakIndexInMountainArray {

    public static int peakIndex(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;   // peak right side
            } else {
                high = mid;      // peak left side (including mid)
            }
        }

        return low;
    }

    // Main method for local testing
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 6, 4, 2};

        int result = peakIndex(arr);

        System.out.println("Peak index is: " + result);
    }
}