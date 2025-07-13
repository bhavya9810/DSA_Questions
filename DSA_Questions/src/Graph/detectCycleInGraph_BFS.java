package Graph;

import java.util.*;

public class detectCycleInGraph_BFS {

	static class Pair{
		
		int elem;
		int parent;
		
		Pair(int elem, int parent){
			this.elem=elem;
			this.parent=parent;
		}
		
	}
	
	public boolean checkForCycle(int val, ArrayList<ArrayList<Integer>> adjList,boolean[] visited) {
		
		Queue<Pair> queue=new LinkedList<>();
		visited[val]=true;
		queue.add(new Pair(val,-1));
		
		while(!queue.isEmpty()) {
			
			int node=queue.peek().elem;
			int parent=queue.peek().parent;
			
			queue.remove();
			
			for(int adjElem:adjList.get(node)) {
				
				if(visited[adjElem]==false) {
					visited[adjElem]=true;
					queue.add(new Pair(adjElem,node));
				}
				else if(parent!=adjElem) {
					return true;
				}
			}
		}
		
		return false;
		
		
	}
	
	public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adjList){
		
		
		boolean visited[]=new boolean[v];
		
		Arrays.fill(visited, false);
		
		for(int i=0;i<v;i++) {
			if(visited[i]==false) {
				if(checkForCycle(i,adjList,visited)) return true;
			}
		}

		
		return false;
		
		
	}
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
		
		for(int i=0;i<8;i++) {
			adjList.add(new ArrayList<>());
		}
		
		adjList.get(1).add(2);
		adjList.get(1).add(3);
		adjList.get(2).add(1);
		adjList.get(2).add(5);
		adjList.get(3).add(1);
		adjList.get(3).add(4);
		adjList.get(3).add(6);
		adjList.get(4).add(3);
		adjList.get(5).add(2);
		adjList.get(5).add(7);
		adjList.get(6).add(3);
		adjList.get(6).add(7);
		adjList.get(7).add(5);
		adjList.get(7).add(6);
		
		
		
		detectCycleInGraph_BFS obj=new detectCycleInGraph_BFS();
		
		boolean ans=obj.isCycle(8,adjList);
		
		System.out.println(ans);
		
	}
}
