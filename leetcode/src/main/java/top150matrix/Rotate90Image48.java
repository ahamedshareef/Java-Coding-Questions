package top150matrix;

public class Rotate90Image48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][] =  {{1,2,3},{5,6,7},{9,10,11}};
		rotate(matrix);
		
		

	}
	
	public static void rotate(int[][] matrix) {

		// transpose the matrix:
		int n = matrix.length;

		for (int row = 0; row < n; row++) {
			for (int col = row; col < matrix[0].length; col++) {
				int temp = matrix[row][col];
				matrix[row][col] = matrix[col][row];
				matrix[col][row] = temp;
			}
		}

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < matrix.length / 2; j++) {

				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n - 1 - j];
				matrix[i][n - 1 - j] = temp;
			}
		}

	}
}
