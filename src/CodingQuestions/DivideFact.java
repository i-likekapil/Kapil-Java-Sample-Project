package CodingQuestions;

public class DivideFact {
    public static void main(String[] args) {
        System.out.println(countOperations(new int[]{18, 10}));
    }

    private static long countOperations(int[] A) {
        long factA = 1, factB = 1;
        while (A[0] > 0) factA *= A[0]--;
        while (A[1] > 0) factB *= A[1]--;
        return factA / factB;
    }
}