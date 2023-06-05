import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long max = 0, currMax = 0;
		for(int i = 0 ; i< arr.length; i++){
			currMax += arr[i];
            if (max < currMax)
                max = currMax;
            if (currMax < 0)
                currMax = 0;

		}
		if(max<=0)return 0;

		return max;
	}

}
