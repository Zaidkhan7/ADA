package complexity;

import java.util.Arrays;

public class QuickSortComplexity {
	static int count=0;
	public static void main(String args[])
		{
		Sort qs = new Sort();
			int arr1[] = {1,2,3,4,5,6,7};
			int arr2[] = new int[1000];
			int arr3[] = arr2.clone();
			int arr4[] = arr2.clone();
			int arr5[] = new int[1000];
			
			int i , j=0 , number = 1 ;
			
			long start1 = System.currentTimeMillis();
			qs.QuickSort(arr1 ,0 ,arr1.length-1);
			long end1 = System.currentTimeMillis();
			int count1=qs.count;
			qs.count=0;
			for(i=0;i<arr1.length;i++)
			{
				System.out.print(arr1[i]+" ");
			}
			
			for(i=0;i<arr2.length;i++)
			{
				arr2[i] = (int) (Math.random()*10000);
			}
			
			long start2 = System.currentTimeMillis();
			qs.QuickSort(arr2 ,0 ,arr2.length-1);
			long end2 = System.currentTimeMillis();
			
			int count2=qs.count;
			qs.count=0;
			
			Arrays.sort(arr3);
			
			long start3 = System.currentTimeMillis();
			qs.QuickSort(arr3 ,0 ,arr3.length-1);
			long end3 = System.currentTimeMillis();
			
			int count3=qs.count;
			qs.count=0;
			for(i=arr3.length-1;i>=0;i--)
			{
				arr4[j] = arr3[i];
				j++;
			}
			
			long start4 = System.currentTimeMillis();
			qs.QuickSort(arr4 ,0 ,arr4.length-1);
			long end4= System.currentTimeMillis();
			
			int count4=qs.count;
			qs.count=0;
			
			for(i=0;i<arr5.length;i++)
			{
				arr5[i] = number;
			}
			
			long start5= System.currentTimeMillis();
			qs.QuickSort(arr5,0 ,arr5.length-1);
			long end5= System.currentTimeMillis();
			
			int count5=qs.count;
			qs.count=0;
		
			
			System.out.println();
			System.out.println("For 10 defined elements "+(end1-start1)+" ms " + "count = "+count1);
			System.out.println("For 1000 random elements "+(end2-start2)+" ms " + "count = "+count2);
			System.out.println("For 1000 ascending elements "+(end3-start3)+" ms " + "count = "+count3);
			System.out.println("For 1000 desending elements "+(end4-start4)+" ms " + "count = "+count4);
			System.out.println("For 1000 same elements "+(end5-start5)+" ms " + "count = "+count5);
			
		}
	
	static int partition(int arr[], int start, int end) 
    { 	
        int pivot = arr[end];  
        int i = (start-1); 
        for (int j=start; j<end; j++) 
        { 
          
            if (arr[j] < pivot) 
            { 
                i++; 
  
                
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
       
        int temp = arr[i+1]; 
        arr[i+1] = arr[end]; 
        arr[end] = temp; 
  
        return i+1; 
    } 
  
  
   static class Sort{
	   Sort()
	   {
		   
	   }
	   int count;
	   void QuickSort(int arr[], int start, int end) 
	    { 
	    	
	        if (start < end) 
	        { 
	            int pi = partition(arr, start, end);
	            QuickSort(arr, start, pi-1); 
	            QuickSort(arr, pi+1, end);
	            
	        } 
 
	        count++;
	    }   
   }

    
}

