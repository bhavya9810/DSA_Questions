package Graph;

import java.util.*;

public class DFS_graph {
	
	public ArrayList<Integer> dfsOnGraph(int v,ArrayList<ArrayList<Integer>> adjList){
		
		boolean visited[]=new boolean[v+1];
		ArrayList<Integer> ans=new ArrayList<>();
		
		dfs(0,visited,adjList,ans);
		
		return ans;
		
		
	}
	
	public static void dfs(int node,boolean visited[],ArrayList<ArrayList<Integer>> adjList,ArrayList<Integer> ans) {
		
		visited[node]=true;
		
		ans.add(node);
		
		for(Integer i:adjList.get(node)) {
			if(visited[i]==false) {
				dfs(i,visited,adjList,ans);
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			adjList.add(new ArrayList<>());
		}
		
			adjList.get(0).add(2);
			adjList.get(2).add(0);
			adjList.get(0).add(1);
			adjList.get(1).add(0);
			adjList.get(0).add(3);
			adjList.get(3).add(0);
			adjList.get(2).add(4);
			adjList.get(4).add(2);
			
			DFS_graph sol=new DFS_graph();
			
		ArrayList<Integer> ans=	sol.dfsOnGraph(5, adjList);
		
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
	}
}
