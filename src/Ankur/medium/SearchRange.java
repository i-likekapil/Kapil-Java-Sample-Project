package Ankur.medium;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int startIndex = search(nums, target, true);
        int lastIndex = search(nums, target, false);

        ans[0] = startIndex;
        ans[1] = lastIndex;
        return ans;
    }

    private static int  search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0, end = nums.length, mid = 0;

        while (start <= end){
            mid = (start + end)/2;

            if (target < nums[mid]){
                end--;
            }else if (target > nums[mid]){
                start++;
            }else{
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                }else
                    start = mid + 1;
            }
        }

        return ans;
    }
}
