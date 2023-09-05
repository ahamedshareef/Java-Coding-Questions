package SalesForce;

import java.util.ArrayList;
import java.util.List;

/* Given a Matrix of integer and coordinates of a rectangular region of the matrix , return sum of that rectangle only
 * example: 
 * 1234
 * 5678
 * 8765
 * 4321
 * 
 * ip
 * 0,0
 * 0,0
 * 
 * op
 * 1
 * 
 * ip
 * 0,0
 * 0,3
 * op
 * 10
 */

public class RectangluarSum2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> row1 = new ArrayList<Integer>();
		ArrayList<Integer> row2 = new ArrayList<Integer>();
		ArrayList<Integer> row3 = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		
		row1.add(1);
		row1.add(2);
		row1.add(3);
		row1.add(4);
		
		row2.add(5);
		row2.add(6);
		row2.add(7);
		row2.add(8);
		
		row3.add(5);
		row3.add(6);
		row3.add(7);
		row3.add(2);
		
		matrix.add(row1);
		matrix.add(row2);
		matrix.add(row3);
		
		
		//System.out.println(rectangularSum(matrix,"0,0","1,3"));
		
		int[][] a = {{1,2,3,4},{4,5,6,7},{8,7,2,4}};
		int[] c1 = {0,0}; 
		int[] c2 = {2,1};
		
		System.out.println(rectangularSum(a,c1,c2));
				
		
		
		

	}
	
	
	public static int rectangularSum(ArrayList<ArrayList<Integer>> matrix, String cor1, String cor2) {
		
		String[] c1 = cor1.split(",",0);
		String[] c2 = cor2.split(",",0);
		
		int x1 = Integer.parseInt(c1[0]);
		int y1 = Integer.parseInt(c1[1]);
		
		
		int x2 = Integer.parseInt(c2[0]);
		int y2 = Integer.parseInt(c2[1]);
		
		int sum =0;
		
		for(int i=x1;i<=x2;i++) {
			for(int j=y1;j<=y2;j++) {
				sum += matrix.get(i).get(j);
			}
			
		}
		
		
		
		return sum;
		
	}
	
	
	
	
public static int rectangularSum(int[][] arr2D, int[] cor1, int[] cor2) {
		
		int sum =0;
		for(int i=cor1[0];i<=cor2[0];i++) {
			for(int j =cor1[1];j<=cor2[1];j++) {
				sum += arr2D[i][j];
			}
		}
		return sum;
		
	}

}
