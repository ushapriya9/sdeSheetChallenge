import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> nums , int n, int k) {
		int res = k;
        int sum = 0;
        for(int left = 0, i = 0; i<nums.size(); i++){
            if(nums.get(i) == 0){
                sum++;
            }
			
			while(sum >k && left<= i){
				if(nums.get(left) == 0){
					sum--;
				}
				left++;
			}

			res = Math.max(res, i-left+1);
        }
        return res;
	}
}
