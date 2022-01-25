package chegg;

import java.util.Scanner;

public class Tushar {

    public static void main(String[] args) {

        long totalmem = Runtime.getRuntime().totalMemory();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer id : ");
        int cId = sc.nextInt();
        System.out.println("Enter Unit price : ");
        double unit = sc.nextDouble();
        System.out.println("Enter Quantity id : ");
        int qty = sc.nextInt();
        System.out.println("Enter discount : ");
        double dst = sc.nextDouble();

        double total_bef = qty*unit, total_aft = total_bef - dst*total_bef;
        System.out.println("Total Price (Before Discount) : "+total_bef);
        System.out.println("Total Price (After Discount) : "+total_aft);

        long totalaf = Runtime.getRuntime().totalMemory();
    }
    public static int testCase(String str){
        if(str != null) {
            System.out.println("Hello " + str);
            return str.length();
        }
        return -1;
    }

}


/**
 * long maxMemory=Runtime.getRuntime().maxMemory();
 * long toBeFilled=100  1000 1024;
 * long totalMemory= Runtime.getRuntime().totalMemory();
 * long usedMemory=totalMemory - Runtime.getRuntime().freeMemory();
 *
 *
 *
 * long startTime = Calendar.getInstance().getTimeInMillis();
 * long currentTimeDuration = System.currentTimeMillis() - startTime;
 *
 *
 * */
