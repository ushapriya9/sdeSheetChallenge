import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int minElemToLeft = Integer.MAX_VALUE, maxProfit = 0;
        for(int i : prices){
            minElemToLeft = Math.min(minElemToLeft, i);
            maxProfit = Math.max(i - minElemToLeft, maxProfit);
        }
        return maxProfit;
    }
}
