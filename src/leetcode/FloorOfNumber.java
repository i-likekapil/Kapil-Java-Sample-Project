package leetcode;

public class FloorOfNumber {
    public static void main(String[] args) {
        System.out.println(floorOfANumber(new int[]{1, 2, 3, 4, 5, 7, 8, 9}, 0));
    }

    private static int floorOfANumber(int[] arr, int key) {
        if (arr[0] > key) return arr[0];
        if (arr[arr.length - 1] == key) return arr[arr.length - 1];
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (end + start) / 2;
            if (arr[mid] == key) return arr[mid];
            if (arr[mid] > key && arr[mid - 1] < key) return arr[mid];
            else if (arr[mid] > key) end -= 1;
            else start += 1;
        }
        return -1;
    }


}
