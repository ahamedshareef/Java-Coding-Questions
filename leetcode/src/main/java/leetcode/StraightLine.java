package leetcode;

public class StraightLine {

	public static void main(String[] args) {
		
		int[][] line = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
		
		findStraightLine(line);

	}
	
	//(y2-y1)*(x3-x2)    == (y3-y2)*(x2-x1)
	
private static boolean findStraightLine(int[][] coordinates) {
		
		if(coordinates.length==2) {return true;}
		
		for(int i=0;i<coordinates.length-2;i++) {
		
			int CurrentSlope = ((coordinates[i+1][1])-(coordinates[i][1]))*((coordinates[i+2][0])-(coordinates[i+1][0])); 
			int NextSlope = ((coordinates[i+2][1])-(coordinates[i+1][1]))*((coordinates[i+1][0])-(coordinates[i][0]));
			System.out.println("Current Slope"+ CurrentSlope);
			System.out.println("Next Slope "+NextSlope);
			if(CurrentSlope == NextSlope)
				continue;
			else
				return false;
			
		}
		return true;
	}

//	(y2-y1)/ (x2-x1)  == (y3-y2)/(x3-x2)
	
	private static boolean findStraightLine2(int[][] coordinates) {
		
		if(coordinates.length==2) {return true;}
		
		for(int i=0;i<coordinates.length-2;i++) {
		
			int CurrentSlope = (coordinates[i+1][1])-(coordinates[i][1])/(coordinates[i+1][0])-(coordinates[i][0]); 
			int NextSlope = (coordinates[i+2][1])-(coordinates[i+1][1])/(coordinates[i+2][0])-(coordinates[i+1][0]);
			System.out.println("Current Slope"+ CurrentSlope);
			System.out.println("Next Slope "+NextSlope);
			if(CurrentSlope == NextSlope)
				continue;
			else
				break;
			
		}
		return false;
	}

}
