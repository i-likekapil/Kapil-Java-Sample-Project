package amcat;

import java.util.Scanner;

public class DateCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String date1 = "20210902";//scan.nextLine();//past date
        String date2 = "20210903";//scan.nextLine();//current date
        System.out.println(date1 + "\n" + date2);
        int y1 = Integer.parseInt(date1.substring(0, 4));
        int m1 = Integer.parseInt(date1.substring(4, 6));
        int d1 = Integer.parseInt(date1.substring(6));
        int y2 = Integer.parseInt(date2.substring(0, 4));
        int m2 = Integer.parseInt(date2.substring(4, 6));
        int d2 = Integer.parseInt(date2.substring(6));

        if (d2 < d1) {
            if (m2 == 3) {
                if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0)) d2 += 29;
                else d2 += 28;
            } else if (m2 == 5 || m2 == 7 || m2 == 10 || m2 == 12) d2 += 30;
            else d2 += 31;
            m2 -= 1;

        }
        if (m2 < m1) {
            m2 += 12;
            y2 -= 1;
        }
        int D = d2 - d1;
        int M = m2 - m1;
        int Y = y2 - y1;
        if(D<3 && D!=0 && M==0 && Y==0) System.out.println(true);
        else System.out.println(false);
        String ans = Y + " years " + M + " months " + D + " days.";
        System.out.println(ans);

    }
}
