import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.

        Arrays.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

        List<Interval> res = new ArrayList<>(intervals.length);
        for(Interval newInterval : intervals){
            if(res.size()>0){
                Interval prevInterval = res.get(res.size()-1);
                if(prevInterval.finish >= newInterval.start){
                    newInterval.start = Math.min(newInterval.start, prevInterval.start);
                    newInterval.finish = Math.max(newInterval.finish, prevInterval.finish);
                    res.remove(res.size()-1);
                }
            }
            res.add(newInterval);
        }
        return res;
    }
}
