package Graph;

public class GraphRepresentation_AdjacencyMatrix {
	
	public static void main(String[] args) {
		
		
		int n=3,m=3;
		int adj[][]=new int[3][3];
		
		
		//edge 1->2,2->1
		adj[1][2]=1;
		adj[2][1]=1;
		
		//edge 2->3,3->2
		adj[2][3]=1;
		adj[3][2]=1;

		//edge 1->3,3->1
		adj[1][3]=1;
		adj[3][1]=1;
		
		//edge u->v,v->u
//		
//		adj[u][v]=1;
//		adj[v][u]=1;


		
	}

}
