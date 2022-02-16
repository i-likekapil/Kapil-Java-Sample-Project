package Ankur.easy;

import java.util.ArrayList;
import java.util.List;

public class KidsGreatestCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        kidsWithCandies(candies, 3);
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(10);
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < candies.length ; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= max ){
                result.add(i,true);
            }
            else
                result.add(i,false);
        }
        System.out.println(result);
        return result;
    }
}
