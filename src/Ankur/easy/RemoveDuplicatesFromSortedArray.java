package Ankur.easy;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4};
        removeDuplicates(arr);
    }

    private static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if(n == 0 || n == 1){
            return n;
        }else{
            int j = 0;
            for(int i = 0 ; i < n-1; i++){
                if (arr[i] != arr[i+1]){
                    arr[j++] = arr[i];
                }
                arr[j++] = arr[n-1];
            }
            return j;
        }
    }
}
