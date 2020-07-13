class Solution {
    public int numIslands(char[][] grid) {
        int count =0;
        if(grid == null||grid.length==0)
            return 0;
        
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i<grid.length;i++){
            for(int j = 0; j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(grid,i,j,m,n);
                    count++;
                }
            }
        }
        return count;
    }
    
    void dfs(char [][] grid,int i,int j,int m , int n)
    {
        if( i>=m || i< 0 || j>=n || j< 0 || grid[i][j]=='0')
            return;
         if(grid[i][j]=='1')
             grid[i][j]='0';
        dfs(grid,i+1,j,m,n);
        dfs(grid,i-1,j,m,n);
        dfs(grid,i,j+1,m,n);
        dfs(grid,i,j-1,m,n);
        return;
    }
   
}
