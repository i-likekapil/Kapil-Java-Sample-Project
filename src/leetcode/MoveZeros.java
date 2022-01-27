package leetcode;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeros(new int[]{0,1,0,3,12})));
        System.out.println(Arrays.toString(moveZeros(new int[]{0})));
    }

    private static int[] moveZeros(int[] arr) {
        if(arr.length == 1) return arr;
        int lastNonZero = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[lastNonZero++]=arr[i];
            }
        }
        for(int i=lastNonZero;i< arr.length;i++)
            arr[i]=0;
        return arr;

    }

}
