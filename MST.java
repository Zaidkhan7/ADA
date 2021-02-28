package complexity;

import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
public class MST { 
 
  
  
  
    int minKey(int key[], Boolean mstSet[]) 
    { 
    
        int min = Integer.MAX_VALUE, min_index = -1; 
  
        for (int v = 0; v < 5; v++) 
            if (mstSet[v] == false && key[v] < min) { 
                min = key[v]; 
                min_index = v; 
            } 
  
        return min_index; 
    } 
  
   
    void printMST(int parent[], int graph[][],int key[]) 
    { 
        System.out.println("Edge \tWeight"); 
        int weight=0;
        for (int i = 1; i < 5; i++) {
        	weight = weight+key[i];
        	
        	System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]); 
        	System.out.println("updated weight : "+weight);
        }
            
    } 
  

    void primMST(int graph[][]) 
    { 
     
        int parent[] = new int[5]; 
  
     
        int key[] = new int[5]; 
  
      
        Boolean mstSet[] = new Boolean[5]; 
  
       
        for (int i = 0; i < 5; i++) { 
            key[i] = Integer.MAX_VALUE; 
            System.out.println(key[i]);
            mstSet[i] = false; 
        } 
  
       
        key[0] = 0; // 
       
        parent[0] = -1; 
  

        for (int count = 0; count < 4; count++) { 
           
            int u = minKey(key, mstSet); 
  
          
            mstSet[u] = true; 
  
           
            for (int v = 0; v < 5; v++) 
  
                 
                if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) { 
                    parent[v] = u; 
                    key[v] = graph[u][v]; 
                } 
        } 
  
        
        printMST(parent, graph,key); 
    } 
  
    public static void main(String[] args) 
    { 
      
        MST t = new MST(); 
        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 }, 
                                      { 2, 0, 3, 8, 5 }, 
                                      { 0, 3, 0, 0, 7 }, 
                                      { 6, 8, 0, 0, 9 }, 
                                      { 0, 5, 7, 9, 0 } }; 
  
        
        t.primMST(graph); 
    } 
} 