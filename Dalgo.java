package complexity;

public class Dalgo {


     
    int minDistance(int dist[], Boolean sptSet[]) 
    { 

        int min = 10000000, min_index = -1; 
  
        for (int v = 0; v < 5; v++) 
            if (sptSet[v] == false && dist[v] <= min) { 
                min = dist[v]; 
                min_index = v; 
            } 
  
        return min_index; 
    } 
  

    void printSolution(int dist[]) 
    { 
        System.out.println("Vertex \t\t Distance from Source"); 
        for (int i = 0; i < 5; i++) 
            System.out.println(i + " \t\t " + dist[i]); 
    } 
  
    
 
    void dijkstra(int graph[][], int src) 
    { 
        int dist[] = new int[5]; 
  
     
        Boolean sptSet[] = new Boolean[5]; 
  
        for (int i = 0; i < 5; i++) { 
            dist[i] = 10000000; 
            sptSet[i] = false; 
        } 
  
        dist[src] = 0; 
  
        for (int count = 0; count < 4; count++) { 
          
            int u = minDistance(dist, sptSet); 
  
       
            sptSet[u] = true; 
  
         
            for (int v = 0; v < 5; v++) 
  
                
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != 10000000 && dist[u] + graph[u][v] < dist[v]) 
                    dist[v] = dist[u] + graph[u][v]; 
        } 
  
       
        printSolution(dist); 
    } 
  
   
    public static void main(String[] args) 
    { 
        
        int graph[][] = new int[][] {{ 0, 3, 0, 0, 5}, 
            						 { 0, 0, 8, 5, 3 }, 
            						 { 0, 0, 0, 0, 0 }, 
            						 { 0, 2, 0, 0, 0 }, 
            						 { 0, 0, 0, 4, 0 },  };
        Dalgo t = new Dalgo(); 
        t.dijkstra(graph, 0); 
    } 
} 

