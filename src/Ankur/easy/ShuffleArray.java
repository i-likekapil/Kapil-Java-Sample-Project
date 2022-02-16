package Ankur.easy;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int[] ans = shuffleArr(nums, 3);
        System.out.println(Arrays.toString(ans));
    }

    static int[]  shuffleArr(int[] nums, int n){
        int[] out = new int[nums.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            out[index] = nums[i];
            out[index+1] = nums[n + i];
            index += 2;
        }
        return out;
    }
}
