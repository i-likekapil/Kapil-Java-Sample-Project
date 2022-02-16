package Ankur.medium;
//largest number smaller than equal to target
public class Floor {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,9,13};
        System.out.println(findFloor(arr, 8));
    }

    private static int findFloor(int[] arr, int i) {
        int start = 0;
        int end = arr.length;
        int mid = 0;

        while(start <= end){
            mid = (start + end)/2;
            if(i > arr[mid]){
                start++;
            }
            else if(i < arr[mid]){
                end--;
            }
            else
                return mid;
        }
        return end;
    }
}
