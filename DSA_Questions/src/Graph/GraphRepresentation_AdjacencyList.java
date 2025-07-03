package Graph;

import java.util.*;

public class GraphRepresentation_AdjacencyList {
	
	public static void main(String[] args) {
		
		int n=3,m=3;
		
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		
		for(int i=0;i<=n;i++) {
			adj.add(new ArrayList<>());
			
			
			//edge 1---2
			adj.get(1).add(2);
			adj.get(2).add(1);
//			
//			adj.get(u).add(v);
//			adj.get(v).add(u);
			
			adj.get(1).add(3);
			adj.get(3).add(1);
			
			
			adj.get(2).add(3);
			adj.get(3).add(2);
		}
	}

}
