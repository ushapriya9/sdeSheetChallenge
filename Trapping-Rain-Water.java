import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        long[] leftMax = new long[n];
        leftMax[0] = 0;
        long[] rightMax = new long[n];
        rightMax[n-1] = 0;

        for(int i = 1; i< n; i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i-1]);
        }
        for(int i = n-2; i>0; i--){
            rightMax[i] = Math.max(rightMax[i+1], arr[i+1]);
        }
        long total = 0;
        for(int i = 1; i< n-1; i++){
            total+= Math.max(0, Math.min(leftMax[i], rightMax[i])- arr[i]);
        }
        return total;
    }
}
