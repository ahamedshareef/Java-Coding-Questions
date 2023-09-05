package leetcode;

public class BuySellStock122 {

	public static void main(String[] args) {
		int[] prices = {7,1,54,54,60,4};
		System.out.println(maxProfit(prices));

	}

	private static int maxProfit(int[] prices) {
		if(prices == null || prices.length <=0)return 0;
		int total_profit = 0;
		
		for(int i=1;i<prices.length;i++) {
			if(prices[i-1]<prices[i]) {
				total_profit += prices[i] - prices[i-1];
			}
		}
		return total_profit;
	}

}
