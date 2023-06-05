import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int k = arr1.length-1;
        while(m>0 && n>0){
            if( arr1[m-1] > arr2[n-1]){
                arr1[k--] = arr1[m-1];
                m--;
            }else{
                arr1[k--] = arr2[n-1];
                n--;
            }
        }
        while(m>0 && k>=0){
            arr1[k--] = arr1[m-1];
            m--;
        }
        while(k>=0 && n>0){
            arr1[k--] = arr2[n-1];
            n--;
        }
        return arr1;
    }
}
