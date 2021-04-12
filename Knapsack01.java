package complexity;

import java.util.Scanner;

public class Knapsack01 {

	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		int weight[] = {10,20,30,40};
		int value[] = {20,60,180,120};
		int count[] = {0,0,0,0};
		int capacity = 50;
		int n = value.length;
		System.out.println("Total profit : "+knapSack(capacity,weight,value,n));
		
		
	}
	
	static int max(int a, int b) 
    { 
      return (a > b) ? a : b; 
    }
 

    static int knapSack(int capacity, int weignt[], int value[], int n)
    {
    	int i, w;
        int K[][] = new int[n + 1][capacity + 1];
 
       
        for (i = 0; i <= n; i++) 
        {
            for (w = 0; w <= capacity; w++) 
            {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (weignt[i - 1] <= w)
                    K[i][w]
                        = max(value[i - 1]
                         + K[i - 1][w - weignt[i - 1]],
                         K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
        i=0;
        for( i=0;i<n+1;i++)
        {
        	for(int j = 0;j<capacity+1;j++)
        	{
        		System.out.print(K[i][j]+" ");
        	}
        	System.out.println();
        }
 
        return K[n][capacity];
    }
    
 
}
