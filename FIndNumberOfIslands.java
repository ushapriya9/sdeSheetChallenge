public class Solution 
{
    private static int[][] diffs = new int[][]
        {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
    public static int getTotalIslands(int[][] mat) 
	{
        int[][] visited = new int[mat.length][mat[0].length];
        int count = 0;

        for(int i = 0 ; i< mat.length; i++){
            for(int j = 0 ; j<mat[i].length; j++){
                if(visited[i][j] == 0 && mat[i][j] == 1){
                    count++;
                    dfs(i, j, mat, visited);
                }
            }
        }
        return count;
    }
    private static void dfs(int i, int j, int[][]mat, int[][]visited){
        if(i<0 || j<0 || i>=mat.length 
        || j>=mat[i].length || visited[i][j] == 1){
            return;
        }
        visited[i][j] = 1;

        for(int[] a : diffs){
            if(shouldProceed(i+a[0],j+a[1],mat)) dfs(i+a[0],j+a[1], mat, visited);
        }    
    }

    private static boolean shouldProceed(int i, int j, int[][]mat){
        if(i<0 || j<0 || i>=mat.length 
        || j>=mat[i].length ){
            return false;
        }
        return mat[i][j] == 1;
    }
}
