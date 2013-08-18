//Program works cool except it does not solve the last element board[8][8].
//Solved the problem in 2 hours
public class sudoku{
	boolean boardFlag[][] = new boolean[9][9];
	void initializeBoard(int board[][])
	{
		for(int i=0;i<9;i++)
			for(int j=0;j<9;j++)
				{if(board[i][j]>0)
					boardFlag[i][j]=true;
				}
				
	}
	boolean checkPossibility(int board[][],int row,int col,int val)
	{
		for(int i=0;i<9;i++)
		{
			if(i==row)
				continue;
			if(board[i][col]==val)
				return false;
		}
		for(int i=0;i<9;i++)
		{
			if(i==col)
				continue;
			if(board[row][i]==val)
				return false;
		}
		
		int findRow = row/3;
		int findCol = col/3;
		findRow*=3;
		findCol*=3;
		
		for(int i=findRow;i<findRow+3;i++)
			for(int j = findCol;j<findCol+3;j++)
			{
				if(board[i][j]==val)
					return false;
			}
	return true;
	}
	void display(int board[][])
	{
		for(int i =0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				System.out.print(" "+board[i][j]);
			}
			System.out.println("");
		}
	}
	
	boolean solver(int board[][],int row,int col)
	{
		boolean placed = false;
		boolean ret = false;
		if((row==9)||(col==9))
		{
		return true;
		}
		if(boardFlag[row][col]==true)
		{
			boolean result = solver(board,row+1,col);
			return result;
		}
		if(row==8 && col==8)
		{
			display(board);
			System.exit(0);
		}
		
	
	
			{
				for(int k=1;k<10;k++)
					{placed = checkPossibility(board, row, col, k);
						if(placed)
						{
							placed = true;
							board[row][col]=k;
							ret = solver(board,row+1,col);
							if(ret)
								{
									ret = solver(board,0,col+1);
									if(ret)
										return ret;
									else
									{board[row][col]=0;
									placed = false;
									continue;
									}
								}
							else
							{
								board[row][col]=0;
								placed = false;
								continue;
							}
						}
						else
						{											
						if((k==9)&&(placed==false))
							return false;
						}
						if((k>=9)&&(placed==false))
							return false;
					}
			
			}
			
		return false;
	}
	public static void main(String args[])
	{
		int board[][]=new int[9][9];
		//Some online sudoku problem
		board[3][3]=1;
		board[4][4]=6;
		board[2][2]=5;
		board[0][0]=1;
		board[7][7]=3;
		board[8][3]=5;
		sudoku c = new sudoku();
		c.initializeBoard(board);
		c.solver(board,0,0);
	}

}