package amcat;

import java.util.Scanner;

public class Easy {
    static Scanner scanner = new Scanner(System.in);
    public static String findGcdLcm(){
        System.out.println("Enter two positive numbers : ");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int lcm=0,gcd=0;
        for(int i=1;i<=a && i <=b; i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }

        /**
        * long gcd(long x, long y)
         * {
         *   if (y == 0) {
         *   	return x;
         *   }
         *   else {
         *     return gcd(y, x % y);
         *   }
         * }
        * */
        lcm = (a*b)/gcd;
        return "Lcm : "+lcm+" Gcd : "+gcd;
    }

    public static boolean isPrime(){
        System.out.println("Enter postive number :");
        int num = scanner.nextInt();
        if(num ==1) return false;
        for (int i = 2; i*i <num ; i++) {
            if(num%i==0){
                return false;
            }
        }
        return  true;
    }



}
