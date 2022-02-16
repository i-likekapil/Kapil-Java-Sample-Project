package Ankur.easy;

public class SmallerThanCurr {
    public static void main(String[] args) {
//        int[] arr = {7,7,7,7};
        int digit = 232342;
        System.out.println(noOfDigits(digit));
//        int[] res = smallerNumbersThanCurrent(arr);
//        System.out.println(Arrays.toString(res));
    }

    private static int noOfDigits(int digit) {
        int digCount = (int)(Math.log10(digit) + 1);
        return digCount;
    }

    public static int[] smallerNumbersThanCurrent(int[] arr) {
        int[] res = new int[arr.length];
        int count = 0;
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    count++;
                    res[i] = count;
                }
            }
            count = 0;
        }
        return res;
    }
}
