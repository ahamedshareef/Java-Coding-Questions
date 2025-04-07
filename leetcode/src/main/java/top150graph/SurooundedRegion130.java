package top150graph;

public class SurooundedRegion130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
public void solve(char[][] board) {
	if(board == null || board.length ==0)
		return;
	
	int rows = board.length;
	int cols = board[0].length;
	
	 // Check the border cells first
    // 1. First and last rows
	
	for(int j=0;j<cols;j++) {
		dfs(board,0,j);
		dfs(board,rows-1,j);
	}
	
	for(int i=0;i<rows;i++) {
		dfs(board,i,0);
		dfs(board,i,cols-1);
	}
	
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
		if(board[i][j]=='0') {board[i][j]='X';}
		else if(board[i][j]=='#') {board[i][j]='0';}
		
		}
		}
        
    }

public void dfs (char[][] board, int i, int j) {
	int rows = board.length;
	int cols = board[0].length;
	
	if(i<0||i>=rows||j<0||j>=cols||board[i][j]!='0')
		return;
	
	board[i][j]='#';
	
	// Visit adjacent cells in all four directions
	dfs(board,i+1,j);
	dfs(board,i-1,j);
	dfs(board,i,j+1);
	dfs(board,i,j-1);
	
}

}
