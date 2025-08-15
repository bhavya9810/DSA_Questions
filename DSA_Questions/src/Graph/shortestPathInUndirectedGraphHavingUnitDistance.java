package Graph;

import java.util.*;

public class shortestPathInUndirectedGraphHavingUnitDistance {
	
	static class Pair{
		
		int first;
		int dist;
		
		Pair(int first,int dist){
			this.first=first;
			this.dist=dist;
		}
		
	}
	
	
	public static void main(String[] args) {
			
		int n=9;
		int m=10;
		int adj[][]= {{0,1},{0,3},{3,4},{4,5},{5,6},{1,2},{2,6},{6,7},{7,8},{6,8}};
		
		
		shortestPathInUndirectedGraphHavingUnitDistance sp=new shortestPathInUndirectedGraphHavingUnitDistance();
		
		int result[]=sp.shortestPath(adj,0,n,m);
		
		for(int i=0;i<n;i++) {
			System.out.print(result[i]+" ");
		}
		
	}
	
	public int[] shortestPath(int adj[][],int src,int node,int edges) {
		
		List<List<Integer>> adjList=new ArrayList<>();
		
		for(int i=0;i<node;i++) {
			
			adjList.add(new ArrayList<>());
		}
		
		for(int i=0;i<edges;i++) {
			adjList.get(adj[i][0]).add(adj[i][1]);
			adjList.get(adj[i][1]).add(adj[i][0]);

		}
		
		int distArray[]=new int[node];
		
		int distance=0;
		
		Arrays.fill(distArray,Integer.MAX_VALUE);
		
		Queue<Pair> queue=new LinkedList<>();
		
		queue.add(new Pair(src,distance));
		distArray[src]=distance;
		
		while(!queue.isEmpty()) {
			
			Pair pair=queue.poll();
			
			int f=pair.first;
			int d=pair.dist;
			
			for(int n:adjList.get(f)) {
				
				if(distArray[n]==Integer.MAX_VALUE) {
					queue.add(new Pair(n,d+1));
					distArray[n]=d+1;
				}
			}
		}
		
		for(int i=0;i<distArray.length;i++) {
			if(distArray[i]==Integer.MAX_VALUE) {
				distArray[i]=-1;
			}
		}
		return distArray;
		
	}
}
