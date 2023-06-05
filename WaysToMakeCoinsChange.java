
public class Solution {

	public static long countWaysToMakeChange(int denominations[], int value){
		long [][]dp = new long[value+1][denominations.length+1];

		for(int i = 0 ; i<=value; i++ ){
			for(int j = 0 ; j<=denominations.length; j++ ){
				if( i == 0) dp[i][j] = 1;
				else if(j == 0) dp[i][j] = 0;
				else{
					long notPick = dp[i][j-1];
					long pick = 0;
					if(i >= denominations[j-1]){
						pick = dp[i-denominations[j-1]][j];
					}
					dp[i][j] = pick + notPick;

				}
			}
		}
		return dp[value][denominations.length];

		//return countWaysToMakeChange(denominations, value, denominations.length);
	}
	private static long countWaysToMakeChange(int denominations[], int value, int index ){
		if(index<0 || value <= 0){
			if(value == 0) return 1;
			return 0;
		}
		long notPick = countWaysToMakeChange(denominations, value, index-1);
		long pick = 0;
		if(value >= denominations[index]){
			pick = countWaysToMakeChange(denominations, value-denominations[index], index);
		}
		return pick+notPick;
	}
	
}
