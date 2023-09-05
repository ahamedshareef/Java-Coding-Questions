package Discovery;

public class AddSumofInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sumOfInt(123454));

	}

	private static int
	
	sumOfInt(int n) {
		// TODO Auto-generated method stub
		
		int sum =0;
		int reminder;
		while(n>0) {
			reminder = n%10;
			sum = sum + reminder;
			n = n/10;
		}
		return sum;
		
	}

}
