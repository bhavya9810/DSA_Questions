package Graph;

import java.util.*;

public class TopologicalSort_DFS {
	
	public void dfs(int node,List<List<Integer>> adjList,Stack<Integer> stack,int visited[]) {
		
		visited[node]=1;
		
		for(int n:adjList.get(node)) {
			
			if(visited[n]==0) {
				dfs(n,adjList,stack,visited);
			}
		}
		
		stack.push(node);
		
		
	}
	
	public int[] topoSort(int v,List<List<Integer>> adjList) {
		
		int visited[]=new int[v];
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<v;i++) {
			
			if(visited[i]==0) {
				dfs(i,adjList,stack,visited);
			}
		}
		
		int ans[]=new int[v];
		
		
		
		for(int i=0;i<v;i++) {
			ans[i]=stack.pop();
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		
		int v=6;
		
		List<List<Integer>> adjList=new ArrayList<>();
		
		for(int i=0;i<6;i++) {
			adjList.add(new ArrayList<>());
		}
		
		
		adjList.get(2).add(3);
		adjList.get(3).add(1);
		adjList.get(4).add(1);
		adjList.get(4).add(1);
		adjList.get(5).add(2);
		adjList.get(5).add(0);
		
		TopologicalSort_DFS ts=new TopologicalSort_DFS();
		
		int[] ans=ts.topoSort(v,adjList);
		
		for(int node:ans) {
			System.out.print(node+" ");
		}
		
		
		
	}

}
