package leetcode;

import java.util.Arrays;

public class TwoSumPointer {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));
    }

    private static int[] twoSum(int[] arr, int target) {
        int start = 0, end = arr.length-1;
        int[] res = new int[]{-1,-1};
        while(start<=end)
        {
            if(arr[start]+arr[end]==target)
            {
                res[0]=start+1;
                res[1]=end+1;
                return res;
            }
            else if(arr[start]+arr[end]>target)
                end--;
            else
                start++;
        }
        return res;
    }
}
