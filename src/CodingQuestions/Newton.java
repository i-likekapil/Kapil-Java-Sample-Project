package CodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class Newton {

    public static void main(String[] args) {
        int arr[] = new int[]{4,7,15,8,6,22,1,3,11};
        //System.out.println(isPossible(arr,9,27) == 0 ? "TRUE" : "FALSE");
        char a = '9';
        int x = a - '0';
        //System.out.println(x+2);
        String s1 ="123";
        String s2 ="1"; //135
        System.out.println(addTwoStrings(s1,s2));



    }

    private static String addTwoStrings(String s1, String s2) {
        //String ans ="";
        int a = 0;
        int b = 0;
        char[] x = s1.toCharArray();
        char[] y = s2.toCharArray(); //1,2,3
        for(char A:x){
            int d = A -'0';
            a+=d;
            a*=10;
        }
        //System.out.println(a);
        for(char A:y){
            int d = A -'0';
            b+=d;
            b*=10;
        }
        a=a+b;
        a/=10;
        //System.out.println(a+b);
        return a+"";
    }
    /*public static void print(int n ){
        String str ="";
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <i; j++) {
                if(j==0 ) str+="*";//System.out.print("*");
                else str+="^"; //System.out.print("^");
            }
            if(i != 0) str+="*";//System.out.print("*");
            str+="\n";//System.out.println();
        }
            for (int j = 0; j < n+1; j++) {
                str+="*";
                //System.out.print("*");
            }

        System.out.println(str.substring(2));
    }*/

    /*public static int AllPair(int N){
        int count =0;
        for (int i = 1; i <N ; i++) {
            for (int j = 1; j <N ; j++) {
                if(i+j > N) System.exit(0);
                if(i+j == N) count++;
            }
        }

    int i = 1, j = N - 1;
        while (i < j)
        {
            if (i + j == N)
            {
                count++;
            }
            i++;
            j--;
        }*//*
        return count;
    }*/

    public static  int Operations(int n) {
        int count = 0;
        while (n !=0){
            n-=findUnit(n);
            count++;
        }
        return count;
    }
    public static int findUnit(int n){
        int unit=0;
        while (n != 0) {
            unit = n % 10;
            n /= 10;
        }
        return unit;
    }
    static int AllPair(int N){
        int count =0;
        int loop=0;
        for (int i = 1; i <N ; i++) {
            for (int j = 1; j <N ; j++) {
                if(i+j > N) break;
                if(i+j == N) count++;
                loop++;
            }
        }
        System.out.println("loop is : "+loop);
        return count;
    }
    static int isPossible(int arr[], int n , int input_no){
        /*for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                if(arr[i]+arr[j]==input_no)
                    return 0;*/
        Map<Integer,Integer> map = new HashMap<>();
        int i=0;
        for(int a : arr)
            map.put(a,i++);
        for (i = 0;  i<n ; i++)
            if(map.containsKey(input_no - arr[i]) && map.get(input_no - arr[i]) != i) return 0;
        return 1;
    }


}


