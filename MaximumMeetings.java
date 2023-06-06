import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {        
        //Write your code here
        int[][] meet = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            meet[i][0]=i+1;
            meet[i][1]=start[i];       
            meet[i][2]=end[i];       
        }
        Arrays.sort(meet,Comparator.comparingDouble(o->o[2]));
        List<Integer> list=new ArrayList<>();
        int mcnt=1;
        int last=-1;
        for(int i=0;i<start.length;i++){
            if(meet[i][1]>last){
                list.add(meet[i][0]);
                mcnt++;
                last=meet[i][2];
            }
        }
        return list;
    }
}
