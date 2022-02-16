package Ankur.medium;

import java.util.Collections;
import java.util.List;

public class ArithmaticSubArray {
    public static void main(String[] args) {
        int[] nums = {4,6,5,9,3,7}, l = {0,0,2}, r = {2,3,5};
        checkArithmeticSubarrays(nums, l, r);
    }

    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
    return Collections.singletonList(true);
    }
}
