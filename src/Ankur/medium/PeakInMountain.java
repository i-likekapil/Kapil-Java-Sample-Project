package Ankur.medium;

public class PeakInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,1};
        System.out.println(findPeakElement(arr));
    }

    private static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length;
        int mid = 0;
        while(start < end){
            mid = start + (end - start)/2;
            if(nums[mid] > nums[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }

        }
        return nums[start];
    }
}
