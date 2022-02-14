package CodingQuestions;

public class SearchInfiniteArray {
    public static void main(String[] args) {
        System.out.println(findIndex(new int[]{2, 4, 8, 12, 45, 78, 335, 1234, 9999}, 450));

    }

    private static int binarySearch(int[] arr, int start, int end, int key) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] > key)
                return binarySearch(arr, start, mid - 1, key);
            return binarySearch(arr, mid + 1, end, key);
        }
        return -1;
    }

    public static int findIndex(int[] arr, int key) {
        int start = 0;
        int end = 2;
        while (arr[end] < key) {
            int newStart = end;
            end += (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr,start,end,key);
    }
}
