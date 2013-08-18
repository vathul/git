public class nQueen{
	int size;
	nQueen(int dimension)
	{
		size = dimension;
	}
	boolean checkPossibility(int row,int col,int board[][])
	{
		for(int i=0;i<size;i++)
			if(board[i][col]==1)
				return false;
		for(int i=0;i<size;i++)
			if(board[row][i]==1)
				return false;
		
		int r = row;
		int c = col;
		while(r>=0 && c>=0)
		{
			if(board[r][c]==1)
				return false;
			r--;
			c--;
		}
		r=row;
		c=col;
		while(r<=size-1 && c<=size-1)
		{
			if(board[r][c]==1)
				return false;
			r++;
			c++;
		}
		r=row;
		c=col;
		while(r<=size-1 && c>=0)
		{
			if(board[r][c]==1)
				return false;
			r++;
			c--;
		}
		r=row;
		c=col;
		while(r>=0 && c<=size-1)
		{
			if(board[r][c]==1)
				return false;
			r--;
			c++;
		}
		return true;
	}
	void display(int board[][])
	{System.out.print("\nBoard:\n");
		for(int i=0;i<size; i++)
		{for(int j=0;j<size;j++)
		System.out.print(" "+board[i][j]);
		System.out.println("");
		}
	}
	boolean placeQueens(int board[][],int row,int col)
	{
		int sum = 0;
		if(row == size)
			return true;
		
		for(int i=0;i<size; i++)
			for(int k=0;k<size;k++)
			{
				sum+=board[i][k];
			}
		if(sum==size)
		{
			System.out.println("\nEnd");
			display(board);
			return true;
		}
		
		boolean ret;
		boolean placed = false;
			for(int j=0;j<size;j++)
			{
				boolean check = checkPossibility(row, j, board);
				if(check)
					{board[row][j]=1;
					ret = placeQueens(board, row+1, 0);
					placed = true;
					if(ret)
					{ if(row==size-1)
						display(board);
						return true;
					}
						if(ret==false)
					{
						board[row][j]=0;
						placed=false;
						continue;
					}
					}
				if((j==size-1)&&(placed==false))
					return false;
			}
	return false;
	}
	public static void main(String args[])
	{
		int board[][]= new int[12][12];
		nQueen b = new nQueen(12);
		b.placeQueens(board, 0, 0);
	}
}