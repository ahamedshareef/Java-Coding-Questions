package top150.trees;

public class Search2DMatrix74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length==0|| matrix[0].length==0) return false;
		int rows = matrix.length;
		int cols = matrix[0].length;
		int topRow = 0;
		int bottomRow = rows-1;
		
		
		
		while(topRow <= bottomRow) {
			int midRow = topRow + ( bottomRow - topRow) /2;
			
			if(matrix[midRow][0]<= target && target <= matrix[midRow][cols-1] )// found the rows where we have target
			{
				int left = 0;
				int right = cols-1;
				
				while(left<=right) {
					int midCol = left + ( right-left)/2;
					if(target == matrix[midRow][midCol])
						return true;
					else if(target > matrix[midRow][midCol]) {
						left = midCol+1;
						
					}else {
						right = midCol-1;
					}
				}
				
				return false;
				
			}else if(target > matrix[midRow][0]) {
				topRow = midRow+1;
			}else {
				bottomRow = midRow-1;
			}
			
			
		}
		return false;
	        
	}
	 

}
