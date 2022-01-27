package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayRotate {
    public static void main(String[] args) {
        rotateArray(new int[]{1,2,3,4,5,6,7},3);
    }

    private static void rotateArray(int[] arr, int k) {
        for(int i=0;i<k%arr.length;i++)
            doRotation(arr);
    }

    private static void doRotation(int[] arr) {
        int temp = arr[arr.length-1];
        for(int i= arr.length-2;i>=0;i--)
                arr[i+1]=arr[i];
        arr[0]=temp;
        //System.out.println(Arrays.toString(arr));
    }

}
