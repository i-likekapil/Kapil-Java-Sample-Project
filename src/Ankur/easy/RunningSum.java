package Ankur.easy;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0 ; i < nums.length; i++){
            if(i ==0){
                ans[i] = nums[i];
            }
            else {
                ans[i] = ans[i-1] + nums[i];
            }
        }
        return ans;
    }
}
