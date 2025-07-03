package Graph;


import java.util.*;
public class BFS_graph {
	
	
	public ArrayList<Integer> bfs(int v, ArrayList<ArrayList<Integer>> adjList){

		
		ArrayList<Integer> ans=new ArrayList<>();
		
		boolean visited[]=new boolean[v];
		
		visited[0]=true;
		
		Queue<Integer> queue=new LinkedList<>();
		
		queue.add(0);
		
		while(!queue.isEmpty()) {
			
			Integer node=queue.poll();
			
			ans.add(node);
			
			
			for(Integer i:adjList.get(node)) {
				if(visited[i]==false) {
					visited[i]=true;
					queue.add(i);
				}
			}
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			
			adjList.add(new ArrayList<>());
		}
		
		adjList.get(0).add(1);
		adjList.get(0).add(4);
		adjList.get(1).add(0);
		adjList.get(1).add(2);
		adjList.get(1).add(3);
		adjList.get(2).add(1);
		adjList.get(3).add(1);
		adjList.get(4).add(0);
		
		BFS_graph obj=new BFS_graph();
		
		ArrayList<Integer> result=obj.bfs(5, adjList);
		
		for(int i=0;i<result.size();i++) {
			System.out.print(result.get(i)+" ");
		}
		
	}

}
