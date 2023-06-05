import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        int l = 0, r = arr.length-1;
        for(int i = 0 ; i<=r; ){
            if(arr[i] == 0){
                swap(arr, l++, i++);
            }else if(arr[i] == 2){
                swap(arr, r--, i);
            }else{
                i++;
            }
        }
    }
    private static void swap(int [] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
