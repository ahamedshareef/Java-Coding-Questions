package top150graph;

public class NumberOfIslands200 {

	
	int islandCount =0;	
public int numIslands(char[][] grid) {
	
	if (grid == null || grid.length == 0) {
        return 0;
    }
	
	
	int rows = grid.length;
	int cols = grid[0].length;
	
	
	for(int i=0;i<rows;i++) {
		for(int j=0;i<cols;j++) {
			if(grid[i][j]=='1')
				islandCount++;
			// Use DFS to mark all connected land cells as visited
			dfs(grid,i,j);
		}
	}
	
	return islandCount;
		
        
    }


void dfs(char[][] grid, int row, int col){
	int rows = grid.length;
	int cols = grid[0].length;
	if(row<0|| col<0 || row>=rows || col >= cols || grid[row][col]==0)
		return;
	
	  // Mark current cell as visited by changing it to '0'
	 grid[row][col] = '0';
	 
	dfs(grid, row+1, col);
	dfs(grid, row-1, col);
	dfs(grid, row, col+1);
	dfs(grid, row, col-1);
	
}


}
