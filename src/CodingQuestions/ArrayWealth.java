package CodingQuestions;

public class ArrayWealth {
    public static void main(String[] args) {
        System.out.println(findMax(new int[][]{{1, 2, 3}, {4, 6, 2, 3, 7}, {8, 9}, {89}}));
    }

    private static int findMax(int[][] mat) {
        int max = -1;
        int sum = 0;
        for (int[] arr : mat) {
            for (int x : arr) sum += x;
            max = max > sum ? max : sum;
            sum = 0;

        }


        return max;
    }
}
