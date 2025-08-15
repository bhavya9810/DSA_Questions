package Graph;

import java.util.*;

public class Kahns_Algorithm_TopoSort_BFS {
	
	public int[] kahnsAlgo(int v,List<List<Integer>> adjList) {
		
		int inDegree[]=new int[v];
		
		for(int i=0;i<v;i++) {
			
			for(int n:adjList.get(i)) {
				
				inDegree[n]++;
			}
		}
		
		Queue<Integer> queue=new LinkedList<>();		
		
		
		for(int i=0;i<v;i++) {
			
			if(inDegree[i]==0) {
				queue.add(i);
			}
		}
		
		int[] ans=new int[v];
		int i=0;
		
		while(!queue.isEmpty()) {
			
			int node=queue.poll();
			ans[i++]=node;
			
			
			for(int n:adjList.get(node)){
				
				inDegree[n]--;
				
				if(inDegree[n]==0) {
					queue.add(n);
				}
				
			}
		}
		
		
		
		
		return ans;
	}
	
	public static void main(String[] args) {
		
		int v=6;
		List<List<Integer>> adjList=new ArrayList<>();
		
		for(int i=0;i<v;i++) {
			
			adjList.add(new ArrayList<>());
			
		}
		
		adjList.get(2).add(3);
		adjList.get(3).add(1);
		adjList.get(4).add(0);
		adjList.get(4).add(1);
		adjList.get(5).add(0);
		adjList.get(5).add(2);
		
		Kahns_Algorithm_TopoSort_BFS ka=new Kahns_Algorithm_TopoSort_BFS();
		
		int ans[]=ka.kahnsAlgo(v,adjList);
		
		for(int i=0;i<v;i++) {
			System.out.print(ans[i]+" ");
		}
		
		
		
 	}
	

}
