package algorithms.java.easy;

/**
 * LC#121. Best Time to Buy and Sell Stock
 */
public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        //暴力解法 时间 O(n2)
//        int profit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for(int j = i + 1; j < prices.length; j++) {
//                if((prices[j] - prices[i]) > profit) profit = prices[j] - prices[i];
//            }
//        }
//        return profit;

        //一次遍历 时间 O(n)
        int min = Integer.MAX_VALUE,max = 0;
        for (int i = 0; i < prices.length; i++) {
            if(min > prices[i]) {
                min = prices[i];
            }else if(prices[i] - min > max) max = prices[i] - min;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] stockNums = {7, 6, 4, 3, 1};
//        int[] stockNums = {7,1,5,3,6,4};
        System.out.println("maxProfit = " + maxProfit(stockNums));
    }
}
