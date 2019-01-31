LeetCode
Explore
Problems
Mock 
Contest
Articles
Discuss
 Store 
New Playground
4
Krishnakantha
  Back to Chapter
  Design Tic-Tac-Toe
  Back to Question
      
Java O(1) solution, easy to understand
Java O(1) solution, easy to understand
31.2K
VIEWS
308
Last Edit: October 23, 2018 3:48 PM

bdwalker
bdwalker
 517
Initially, I had not read the Hint in the question and came up with an O(n) solution. After reading the extremely helpful hint; a much easier approach became apparent. The key observation is that in order to win Tic-Tac-Toe you must have the entire row or column. Thus, we don't need to keep track of an entire n^2 board. We only need to keep a count for each row and column. If at any time a row or column matches the size of the board then that player has won.

To keep track of which player, I add one for Player1 and -1 for Player2. There are two additional variables to keep track of the count of the diagonals. Each time a player places a piece we just need to check the count of that row, column, diagonal and anti-diagonal.

Also see a very similar answer that I believe had beaten me to the punch. We came up with our solutions independently but they are very similar in principle.
Aeonaxx's soln

public class TicTacToe {
private int[] rows;
private int[] cols;
private int diagonal;
private int antiDiagonal;

/** Initialize your data structure here. */
public TicTacToe(int n) {
    rows = new int[n];
    cols = new int[n];
}

/** Player {player} makes a move at ({row}, {col}).
    @param row The row of the board.
    @param col The column of the board.
    @param player The player, can be either 1 or 2.
    @return The current winning condition, can be either:
            0: No one wins.
            1: Player 1 wins.
            2: Player 2 wins. */
public int move(int row, int col, int player) {
    int toAdd = player == 1 ? 1 : -1;
    
    rows[row] += toAdd;
    cols[col] += toAdd;
    if (row == col)
    {
        diagonal += toAdd;
    }
    
    if (col == (cols.length - row - 1))
    {
        antiDiagonal += toAdd;
    }
    
    int size = rows.length;
    if (Math.abs(rows[row]) == size ||
        Math.abs(cols[col]) == size ||
        Math.abs(diagonal) == size  ||
        Math.abs(antiDiagonal) == size)
    {
        return player;
    }
    
    return 0;
}
}


Comments: 45
Krishnakantha
 

Type comment here... (Markdown is supported)
Jingqiaoxu
Jingqiaoxu 1  January 3, 2019 3:12 PMReport
Not until you say so, I never discover that there are hints!!

1ShareReply
mrkumar
mrkumar 28  January 1, 2019 2:29 PMReport
Thanks for sharing the solution, it looks great and easily understandable.
This beats like 20% , is there a java code that beats more than 50% for this problem ?

0ShareReply
Aimar88
Aimar88 112  December 30, 2018 3:15 AMReport
Excellent!

0ShareReply
johnson9432
johnson9432 386  December 12, 2018 11:42 AMReport
int toAdd = player == 1 ? 1 : -1;, such a great move, well done!

1ShareReply
aditya123
aditya123 44  December 9, 2018 1:22 AMReport
If this was all your independent idea, hats off!!! (y)

1ShareReply
wzyath
wzyath 3  December 1, 2018 9:56 PMReport
Strong hire!

1ShareReply
yansonghuang
yansonghuang 0  November 4, 2018 10:59 AMReport
thank you for the solution, but how can we know the gird is empty ?

0ShareReply
SHOW 1 REPLY
KimJong-un
KimJong-un 198  November 2, 2018 9:57 AMReport
Inspired by N queen problem, I use four arrays to maintain the current status of the board, whenever the count of one player equals to N, then he wins.
And I also use the index to map to different users.
Plz upvote if you find it useful :)

class TicTacToe {

    /** Initialize your data structure here. */
    
    private int[][] rows;
    private int[][] cols;
    private int[][] diags;
    private int[][] adiags;
    private int n;
    public TicTacToe(int n) {
        rows = new int[n][3];
        cols = new int[n][3];
        diags = new int[2*n][3];
        adiags = new int[2*n][3];
        this.n = n;
    }
    
    public int move(int row, int col, int player) {
        // 1 -> player1
        // 2 -> player2
        rows[row][player] +=1;
        cols[col][player] += 1;
        diags[row+col][player] += 1;
        adiags[row- col+n][player] += 1;
        
        if (rows[row][player] == n ||cols[col][player]==n || diags[row+col][player] == n || adiags[row- col+n][player] == n)
            return player;
        else
            return 0;
    }
}

Read More
2ShareReply
smilemiao
smilemiao 15  October 22, 2018 11:52 AMReport
really smart solution!

0ShareReply
DSandA
DSandA 0  October 17, 2018 10:08 PMReport
Brilliant!

0ShareReply

Enter topic title...

If you want to include code in your post,
please surround your code block with 3 backticks ```.

  For example:
  ```
  def helloWorld():
  	pass
  ```
​
PREVIEW AREA
