/**
 * LC#122 Best Time to Buy and Sell Stock II
 */
public class S122 {

    public static int maxProfit(int[] prices) {
        //暴力计算最大利润组合 时间 O(n2)
//        int profit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for(int j = i + 1; j < prices.length; j++) {
//                if(prices[j] > prices[i]) {
//                    profit += prices[j] - prices[i];
//                    break;
//                }else{
//                    break;
//                }
//            }
//        }
//        return profit;

        //卖出价格高于买入就产生交易，一次遍历 时间 O(n)
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] stock = {7, 1, 5, 3, 6, 4};
//        int[] stock = {1, 2, 3, 4, 5};
        System.out.println("maxProfit > " + maxProfit(stock));
    }
}
