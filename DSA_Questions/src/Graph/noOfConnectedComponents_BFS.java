package Graph;

import java.util.*;

public class noOfConnectedComponents_BFS {
	
	 static class Pair{
		 
		 int first;
		 
		 int second;
		 
		 Pair(int first,int second){
			 this.first=first;
			 this.second=second;
		 }
	 }
	
	public static void main(String[] args) {
		
		char[][] grid= {
				
				{'0','1','1','0','1','0','0'},
				{'0','0','1','1','0','1','0'}
		};
		
		
		noOfConnectedComponents_BFS n =new noOfConnectedComponents_BFS();
		
		System.out.println(n.findComponents(grid));
		
		
	}
	
	public void bfs(char[][] grid,int n,int m,int row,int col,int[][] visited) {
		
		visited[row][col]=1;
		
		Queue<Pair> queue=new LinkedList<>();
		
		queue.add(new Pair(row,col));
		
		while(!queue.isEmpty()) {
			
			Pair node=queue.poll();
			
			int pRow=node.first;
			int pCol=node.second;
			
			for(int deltaRow=-1;deltaRow<=1;deltaRow++) {
				for(int deltaCol=-1;deltaCol<=1;deltaCol++) {
					
					int newRow=pRow+deltaRow;
					int newCol=pCol+deltaCol;
					
					
					if(newRow>=0 && newCol>=0 && newCol<m && newRow<n && grid[newRow][newCol]=='1' && visited[newRow][newCol]==0) {
						queue.add(new Pair(newRow,newCol));
						visited[newRow][newCol]++;
						
					}
					
				}
	
			}
		}
		
		
	}
	
	public int findComponents(char[][] grid) {
		
			
		int n=grid.length;
		int m=grid[0].length;
		
		
		int count=0;
		
		int visited[][]=new int[n][m];
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				
				if(grid[i][j]=='1' && visited[i][j]==0) {
					bfs(grid,n,m,i,j,visited);
					count++;
				}
			}
		}
		
		return count;
		
	}
	
	

}
