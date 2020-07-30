class Solution {
    public void gameOfLife(int[][] board) {
    int[][] res = new int[board.length][ board[0].length];
       for(int i = 0; i < board.length; i++) 
           for(int j = 0; j < board[0].length;j++)
           {
             res[i][j] = checkStatus(board,i ,j); 
           }
      for(int i = 0; i < board.length; i++) 
           for(int j = 0; j < board[0].length;j++)
           {
             board[i][j] = res[i][j]  ;
           }
        
     return;
    }
   
    public int checkStatus(int[][] board, int i , int j)
    {
          
            int sum = getNeighbors(0,board, i , j);
             
        if(sum<2 && board[i][j]==1)
            return 0;
        if((sum==2||sum==3)&&board[i][j]==1)
            return 1;
         if((sum >3)&&board[i][j]==1)
             return 0;
        if((sum==3)&&board[i][j]==0)
             return 1;
        
        return 0;
        
    }
    
       public int getNeighbors(int sum,int[][] board, int i , int j )
        {
            sum = 0;
           System.out.println("i:"+i+" j:"+j);
            if(i-1<0  && (j-1>0 && i<board.length-1 && j<board[0].length-1))
            {
             sum = board[i+1][j]+
                board[i+1][j-1]+
                board[i][j-1]+
                board[i+1][j+1]+
                board[i][j+1];   
            } 
            
            
             
              if(j-1<0 && (i-1>0 && i<board.length-1 && j<board[0].length-1))
               sum = board[i+1][j]+board[i+1][j+1]+board[i][j+1]+board[i-1][j]+board[i-1][j+1];
            
             if( j>board[0].length &&!(j-1<0 || i>board.length||i-1<0))
                 sum =  board[i+1][j]+board[i+1][j-1]+board[i][j-1] +board[i-1][j]+board[i-1][j-1];
        
             if(i>board.length  &&!(j-1<0 || i-1<0 || j>board[0].length))    
                 sum =  board[i][j-1]+board[i][j+1] +board[i-1][j]+board[i-1][j-1]+board[i-1][j+1] ;
                
                return sum;

        }
    
    
}
