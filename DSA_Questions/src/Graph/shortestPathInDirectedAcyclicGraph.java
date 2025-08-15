package Graph;

import java.util.*;

public class shortestPathInDirectedAcyclicGraph {
	
	static class Pair{
		
		int first;
		int weight;
		
		Pair(int first,int weight){
			this.first=first;
			this.weight=weight;
		}
	}
	
	public static void main(String[] args) {
		
		int n=6,m=7;
		
		int edge[][]= {{0,1,2},{0,4,1},{4,5,4},{4,2,2},{1,2,3},{2,3,6},{5,3,1}};
		
		shortestPathInDirectedAcyclicGraph sp=new shortestPathInDirectedAcyclicGraph();
		
		int result[]=sp.shortestPath(edge,n,m);
		
		for(int i=0;i<n;i++) {
			System.out.print(result[i]+" ");
		}
	}
	
	public int[] shortestPath(int edge[][],int n,int m) {
		
		List<List<Pair>> adjList=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			List<Pair> list=new ArrayList<>();
			adjList.add(list);
		}
		
		for(int i=0;i<m;i++) {
			
			int u=edge[i][0];
			int v=edge[i][1];
			int wt=edge[i][2];
			adjList.get(u).add(new Pair(v,wt));
		}
		
		
	Stack<Integer> stack=new Stack<>();
	
	int visited[]=new int[n];
	
	for(int i=0;i<n;i++) {
		if(visited[i]==0) {
			topoSort(stack,visited,adjList,i);
		}
	}
	
	
	int dist[]=new int[n];
	
	Arrays.fill(dist, Integer.MAX_VALUE);
	
	dist[0]=0;
	
	while(!stack.isEmpty()) {
		
		int node=stack.pop();
		
		for(Pair p:adjList.get(node)) {
			
				int v=p.first;
				int wt=p.weight;
				
				if(dist[v]>wt+dist[node]) {
					dist[v]=wt+dist[node];
				}
		}
	}
	
	for(int i=0;i<n;i++) {
		if(dist[i]==Integer.MAX_VALUE) dist[i]=-1;
	}
	
	return dist;
	
		
	}
	
	
	public void topoSort(Stack<Integer> stack,int visited[],List<List<Pair>> adjList,int node) {
		
		visited[node]=1;
		
		for(Pair it:adjList.get(node)) {
			
			int n=it.first;
			
			if(visited[n]==0) {
				topoSort(stack,visited,adjList,n);
			}
		}
		
		stack.add(node);
		
	}
	
	

}
