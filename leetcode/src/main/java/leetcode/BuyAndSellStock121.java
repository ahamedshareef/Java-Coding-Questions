package leetcode;

public class BuyAndSellStock121 {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}

	
	private static int maxProfit(int[] prices) {
		if(prices==null || prices.length<=1) return 0;
		
		int max_profit =0;
		int minBuy=prices[0];
		
		for(int i=1;i<prices.length;i++) {
			minBuy = Math.min(minBuy,prices[i]);
			max_profit = Math.max(max_profit, prices[i] - minBuy);	
			System.out.println(minBuy+"\t"+max_profit);
		}
		
		return max_profit;
		
	}
	
	
	
	private static int maxProfit2(int[] prices) {
		int max_profit =0, buy_day=0,sell_day=0;
		
		for(int i=0;i<prices.length-1;i++) {
			for(int j=i+1;j<prices.length;j++) {
				int new_profit = prices[j]-prices[i];
				if(max_profit<new_profit) max_profit=new_profit;
				
			}
		}
		
		
		
		return max_profit;
		
	}

}
