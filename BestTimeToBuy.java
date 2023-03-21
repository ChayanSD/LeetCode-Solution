// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
import java.util.Arrays;

public class BestTimeToBuy{
public static void main(String[] args) {
    int [] prices = {7,6,4,3,1};
    System.out.println(maxProfit(prices));

}
public static int maxProfit(int[] prices) {
    int min_prices =Integer.MAX_VALUE;
    int profit=0;

    for (int i = 0; i < prices.length; i++) {
        min_prices=Math.min(prices[i],min_prices);
        profit=Math.max(profit,prices[i]-min_prices);
    }
    return profit;
}

}
//Approach :
//travarse the arry and find out the minimum price.
//Then find out the maxumum price and substract from the minimum price.
//than you found the profit.
