package CodingQuestions;

import java.util.Arrays;
import java.util.Collections;

public class MoneyConfusion {
    public static void main(String[] args) {
        System.out.println(countNotes(33, 6, new int[]{1, 4, 20, 3, 10, 5}));
    }

    private static int countNotes(int money, int size, int[] arr) {
        int count = 0;
        Integer[] Arr = new Integer[size];
        for (int i = 0; i < size; i++)
            Arr[i]=arr[i];
        java.util.Arrays.sort(Arr, java.util.Collections.reverseOrder());
        for (int i = 0; i < size; i++) {
            if (money > 0) {
                if (Arr[i] < money) {
                    count++;
                    money -= Arr[i];
                }
            }
        }
        return count;
    }
}
