package CodingQuestions;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,3,5,5,8};
        int key = 5;
        System.out.println(getLeft(arr,key,0, arr.length));
        System.out.println(getRight(arr,key,0, arr.length));
    }

    private static int getRight(int[] arr, int key,int start, int end){
        if(arr[end-1] == key) return end-1;
        if(start > end) return -1;
        int mid = ((start+end) /2);
        if(arr[mid]==key && arr[mid+1] > key) return mid;
        if(arr[mid] < key) return getRight(arr,key,start,mid-1);
        return getRight(arr,key,mid+1,end);
    }

    private static int getLeft(int[] arr, int key,int start, int end){
        if(start > end) return -1; //0>6
        int mid = (start+end) /2; //
        if(arr[mid]==key && arr[mid-1] < key) return mid;
        if(arr[mid] > key) return getLeft(arr,key,start,mid-1);
        return getLeft(arr,key,mid+1,end);
    }


    private static int getRightA(int[] arr, int key) {
        if (arr[arr.length - 1] == key) return arr.length - 1;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (end + start) / 2;
            if (arr[mid] == key && arr[mid + 1] > key) return mid;
            else if (arr[mid] > key) end -= 1;
            else start += 1;
        }
        return -1;
    }

}
