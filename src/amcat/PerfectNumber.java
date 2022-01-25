package amcat;

public class PerfectNumber {
    public static void main(String[] args) {
        for (int i = 1; i <100; i++) {
            if(isSquareRootOrCubeRoot(i))
                System.out.println(i);

        }

    }
    private static boolean isSquareRootOrCubeRoot(int num){
        if(!isPrime(num)) {
            if (num > 0) {
                int x = (int) Math.sqrt(num);
                int y = (int) Math.cbrt(num);
                return num == (x * x) || num == (y * y * y);
            }
            return false;
        }
        return false;
    }

    private static boolean isPrime(int num) {
        if(num ==1) return false;
        else{
            for (int i = 2; i*i <=num ; i++) {
                if(num %i==0) return false;

            }
            return true;
        }
    }
}
