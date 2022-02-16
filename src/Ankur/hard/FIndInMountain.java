package Ankur.hard;

public class FIndInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        System.out.println(findInMountainArray(2,arr));
    }

    private static int findInMountainArray(int target, int[] nums) {
        int peak = findPeak(nums);
        int ans1 = binarySearch(nums, 0, peak, target, true);
        if (ans1 != -1) {
            return ans1;

        } else {
            int ans2 = binarySearch(nums, peak, nums.length - 1, target, false);
            return ans2;
        }
    }
    private static int findPeak(int[] arr){
        int start = 0 ; int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    private static int binarySearch(int[] arr, int start, int end, int target, boolean isAscending){
        while (start <= end) {
            int mid = start + (end - start) / 2;
        if (isAscending) {
                    if (target > arr[mid]) {
                        start = mid + 1;
                    } else if (target < arr[mid]) {
                        end = mid - 1;
                    } else
                        return mid;
            }else
            {
                if (target > arr[mid]){
                    end = mid - 1;
                }else if (target < arr[mid]){
                    start = mid + 1;
                }else
                    return mid;
            }
        }
        return -1;
    }
}
