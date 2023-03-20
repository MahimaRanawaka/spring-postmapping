public class Q16Linear {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
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
