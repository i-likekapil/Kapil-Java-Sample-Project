package Ankur.medium;
//smallest number greater than or equal to target
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,9,13};
        System.out.println(findCieling(arr, 8));
    }

    private static int findCieling(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
