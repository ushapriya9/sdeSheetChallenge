import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
		ArrayList<ArrayList<Long>> res = new ArrayList<>();
		ArrayList<Long> prev = new ArrayList<>();
		int ind = 1;
		while(ind<=n){
			ArrayList<Long> curr = new ArrayList<>();
			for(int i = 0 ; i< ind; i++){
				if(i == 0 || i == ind-1) curr.add((long)1);
				else curr.add(prev.get(i-1) + prev.get(i));
			}
			res.add(curr);
			prev = curr;
			ind++;
		}

		return res;
	}
}
