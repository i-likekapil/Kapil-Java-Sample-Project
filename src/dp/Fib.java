package dp;

import java.util.Calendar;

public class Fib {
    private static int fibo(int n) {
        if (n <= 1) return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    private static int fibo(int n, int[] dp) {
        if (n <= 1) return n;
        if (dp[n] != -1) return dp[n];
        return dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp);
    }

    public static void main(String[] args) {

        long startTime = Calendar.getInstance().getTimeInMillis();
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println(fibo(6));
        long currentTimeDuration = System.currentTimeMillis() - startTime;
        long usedMemory  = totalMemory - Runtime.getRuntime().freeMemory();
        System.out.println("time is " + currentTimeDuration);
        System.out.println("memory is " + usedMemory);

        totalMemory = Runtime.getRuntime().totalMemory();
        startTime = Calendar.getInstance().getTimeInMillis();
        System.out.println(fibo(6, new int[]{-1, -1, -1, -1, -1, -1, -1}));
        currentTimeDuration = System.currentTimeMillis() - startTime;
        usedMemory = totalMemory - Runtime.getRuntime().freeMemory();
        System.out.println("time is " + currentTimeDuration);
        System.out.println("memory is " + usedMemory);

        System.out.println(new Fib().getClass().getName().contains("dp.Fib"));
    }
}
