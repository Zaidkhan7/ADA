package complexity;

import java.util.Scanner;

public class NQueen {

	  
	  
	    void printSolution(int board[][],int n)
	    {
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++)
	             if(board[i][j]==1)
	             {
	            	 System.out.println((i+1)+" "+(j+1));
	             }
	        }
	    }
	 
	    boolean isSafe(int board[][], int row, int col,int n)
	    {
	        int i, j;
	  
	        for (i = 0; i < col; i++)
	            if (board[row][i] == 1)
	                return false;
	  
	        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
	            if (board[i][j] == 1)
	                return false;
	  
	       
	        for (i = row, j = col; j >= 0 && i < n; i++, j--)
	            if (board[i][j] == 1)
	                return false;
	  
	        return true;
	    }
	  
	    /* A recursive utility function to solve N
	       Queen problem */
	    boolean solveNQUtil(int board[][], int col,int n)
	    {
	       
	        if (col >= n)
	            return true;
	  
	        
	        for (int i = 0; i < n; i++) {
	           
	            if (isSafe(board, i, col , n)) {
	               
	                board[i][col] = 1;
	  
	              
	                if (solveNQUtil(board, col + 1, n ) == true)
	                    return true;
	  
	             
	                board[i][col] = 0; 
	            }
	        }
	  
	      
	        return false;
	    }
	  
	   
	    boolean solveNQ(int board[][],int n)
	    {
	    	
	  
	        if (solveNQUtil(board, 0 , n) == false) {
	            System.out.print("Solution does not exist");
	            return false;
	        }
	  
	        printSolution(board,n);
	        return true;
	    }
	  
	    // driver program to test above function
	    public static void main(String args[])
	    {
	        NQueen Queen = new NQueen();
	        Scanner obj = new Scanner(System.in);
	    	System.out.println("Enter Number of block in the board");
	    	int n = obj.nextInt();
	        int board[][] = new int[n][n];
	        int i,j;
	        for(i=0;i<n;i++)
	        {
	        	for(j=0;j<n;j++)
	        	{
	        		board[i][j]=0;
	        	}
	        }
	        Queen.solveNQ(board,n);
	    }
}
