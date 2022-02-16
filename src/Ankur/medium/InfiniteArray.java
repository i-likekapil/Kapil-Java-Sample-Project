package Ankur.medium;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        System.out.println(search(arr,8));
    }

    private static int search(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end + 1;
            end = end + ((end - start + 1) * 2);
            start = newStart;
        }
        return searchRange(arr,target,start,end);
    }

    public static int searchRange(int[] arr, int target, int start, int end){
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
        return -1;
    }
}
