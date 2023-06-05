import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        Set<Integer> cols = new HashSet<>();
        Set<Integer> rows = new HashSet<>();

        for(int i = 0 ; i< matrix.length; i++ ){
            for(int j = 0 ; j< matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int i = 0 ; i< matrix.length; i++ ){
            for(int j = 0 ; j< matrix[i].length; j++){
                if(rows.contains(i) || cols.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }


        // Write your code here..
    }

}
