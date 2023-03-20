public class Q16binary {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 9, 12, 15 };
        int target = 9;
        int index = search(arr, target);
        if (index == -1) {
            System.out.println("Target not found in array");
        } else {
            System.out.println("Target found at index " + index);
        }
    }
}
