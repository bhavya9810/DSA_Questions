package Graph;
import java.util.*;

public class detectCycleInDirectedGraph_DFS {
	
	public boolean detectCycle(int v,List<List<Integer>> adjList) {
		
		int visited[]=new int[v];
		int pathVisited[]=new int[v];
		
		for(int i=0;i<v;i++) {
			
			if(visited[i]==0) {
				
				if(dfs(i,adjList,visited,pathVisited)==true)
					return true;
				
			}
		}
		
		return false;

		
	}
	
	public boolean dfs(int node,List<List<Integer>> adjList,int visited[],int pathVisited[]) {
		
		visited[node]=1;
		pathVisited[node]=1;
		
		for(int n:adjList.get(node)) {
			
			if(visited[n]==0) {
				
				if(dfs(n,adjList,visited,pathVisited)==true) return true;
				
			}
			else if(pathVisited[n]==1) {
				return true;
			}
		}
		
		pathVisited[node]=0;
		return false;
	}
	
	
	public static void main(String[] args) {
		
		List<List<Integer>> adjList=new ArrayList<>();
		
		for(int i=0;i<=10;i++) {
			
			adjList.add(new ArrayList<>());
		}
		
		adjList.get(1).add(2);
		adjList.get(2).add(3);
		adjList.get(3).add(4);
		adjList.get(3).add(7);
		adjList.get(4).add(5);
		adjList.get(5).add(6);
		adjList.get(7).add(5);
		adjList.get(8).add(9);
		adjList.get(9).add(10);
		adjList.get(10).add(8);
		
		detectCycleInDirectedGraph_DFS dt=new detectCycleInDirectedGraph_DFS();
		
		
			System.out.println(dt.detectCycle(11,adjList));
			
			
	}

}
