public class RotatedSortedArraySearch {
    public static int search(int[] arr, int target) {
        return search(arr, target, 0, arr.length - 1);
    }

    private static int search(int[] arr, int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // Check if the mid element is the target
        if (arr[mid] == target) {
            return mid;
        }

        // Check if the left half is sorted
        if (arr[si] <= arr[mid]) {
            // If target is in the left half
            if (arr[si] <= target && target < arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                return search(arr, target, mid + 1, ei);
            }
        } else { // Right half must be sorted
            // If target is in the right half
            if (arr[mid] < target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(arr, target);
        System.out.println("Index of target is: " + result);

        target = 3;
        result = search(arr, target);
        System.out.println("Index of target is: " + result); // Should print -1
    }
}
