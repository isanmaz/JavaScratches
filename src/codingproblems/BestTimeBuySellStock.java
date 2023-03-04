package codingproblems;

public class BestTimeBuySellStock {
/*
 * Input: prices = [7,1,5,3,6,4] max = 0;
 * starting from 7
 * 
 * */
    public static void main(String[] args) {
	int[] input = {7,1,5,3,6,4};
	int profit = maxProfit(input);
	System.out.println(profit);

    }
    public static int maxProfit(int[] prices) {
	int totalMax = 0;
	int left=0;
	int right=1;
	if (prices.length<=1) {
	    return prices[0];
	}
	
	for (int i = 0; i < prices.length; i++) {
	    if (prices[left]<prices[right] && totalMax<=prices[right]-prices[left]) {
		totalMax = prices[right]-prices[left];
	    }
	    else if (prices[left]>prices[right]) {
		left = right;
	    }
	    if (right<prices.length-1) {
		right++;
	    }
	    
	}
	
	
	
	return totalMax;

    }

}
