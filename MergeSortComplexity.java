package complexity;

import java.util.Arrays;
import java.util.Collections;

public class MergeSortComplexity {
	public static void main(String args[])
	{
		int n = 1;
		do{
		//same number array
		
		int num=6,i;
		int arr[] = new int[100000];
		int arr2[]=new int[100000];
		int arr3[] = arr2.clone();
		int arr4[] = arr2.clone();
		for(i=0;i<100000;i++)
		{
			arr[i]=num;
		}
		
		long start1 = System.currentTimeMillis();
		Mergesort(arr, 0,arr.length-1); 	
		long end1 = System.currentTimeMillis();
		System.out.println("Time taken for all elements same is "+(end1-start1));
		
		//sorted array
		for(i=0;i<100000;i++)
		{
			arr2[i] = (int) (Math.random()*1000);
		}
		
		long start2 = System.currentTimeMillis();
		Mergesort(arr2,0,arr2.length-1);
		long end2 = System.currentTimeMillis();
		System.out.println("Time taken for unsorted array is "+(end2-start2));
		
		Arrays.sort(arr3);
		long start3 = System.currentTimeMillis();
		Mergesort(arr3,0,arr2.length-1);
		long end3 = System.currentTimeMillis();
		System.out.println("Time taken for sorted array ascending is "+(end3-start3));
		
		int j=0;
		for(i=arr3.length-1;i>=0;i--)
		{
			arr4[i]=arr3[j];
			j++;
		}
//		for(i=0;i<100000;i++)
//		{
//			System.out.print(arr4);
//		}
		long start4 = System.currentTimeMillis();
		Mergesort(arr4,0,arr4.length-1);
		long end4 = System.currentTimeMillis();
		System.out.println("Time taken for sorted array decending is "+(end4-start4));
		
		n++;
		}while(n<15);
		
		
		
	}

	static void Mergesort(int arr[], int l, int r)
    {
        if (l < r) {
            
            int m = (l + r) / 2;
 
            
            Mergesort(arr, l, m);
            Mergesort(arr, m + 1, r);
 
           
            merge(arr, l, m, r);
        }
    }
	static void merge(int arr[], int l, int m, int r)
    {
        
        int n1 = m - l + 1;
        int n2 = r - m;
 
        
        int L[] = new int[n1];
        int R[] = new int[n2];
 
       
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
       
        int i = 0, j = 0;
 
     
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
}
