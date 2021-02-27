import java.util.Timer;

public class DifferentSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer t = new Timer();
		int arr[] = new int[100000];
		int k,i;
		for(i=0;i<100000;i++)
		{
			 k = (int) (Math.random()*100000);
			 arr[i] = k;
			
		}
		for(i=0;i<100000;i++)
		{
			System.out.println(arr[i]);
		}
		
		long start1 = System.currentTimeMillis();
		int bs[] = BubbleSort(arr,100000);
		long end1  = System.currentTimeMillis();
		
		
//		long start2 = System.currentTimeMillis();
//		int ss[] = SelectionSort(arr,100000);
//		long end2  = System.currentTimeMillis();
	
//		long start3 = System.currentTimeMillis();
//		int is[] = InsertionSort(arr,10000);
//		long end3  = System.currentTimeMillis();
		
		
		
		
		for(i=0;i<10000;i++)
		{
			System.out.println(bs[i]);
		}
		System.out.println("Time Taken in bubble sort : "+(end1-start1));
//		System.out.println("Time Taken in selection sort : "+(end2-start2));
//		System.out.println("Time Taken in insertion sort : "+(end3-start3));

	}
	public static int[] BubbleSort(int arr[], int s)
	{
	
		int i,j,temp=0;
		for(i=0;i<s-1;i++)
		{
			for(j=0;j<s-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
		
	}
	public static int[] SelectionSort(int arr[] , int s)
	{
		int i,j,min=0,temp=0;
		for(i=0;i<s;i++)
		{
			min=i;
			for(j=i+1;j<s;j++)
			{
				if(arr[j]<arr[min])
					min = j;
			}
		temp = arr[min];
		arr[min] = arr[i];
		arr[i] = temp;
		
		}
		return arr;
	}
	public static int[] InsertionSort(int arr[],int s)
	{
		int i, key, j;  
	    for (i = 1; i < s; i++) 
	    {  
	        key = arr[i];  
	        j = i - 1;  
	        while (j >= 0 && arr[j] > key) 
	        {  
	            arr[j + 1] = arr[j];  
	            j = j - 1;  
	        }  
	        arr[j + 1] = key;  
	    }  
	    return arr;
	}

}
