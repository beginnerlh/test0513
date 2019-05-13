/*
给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee代表了交易股票的手续费用。

你可以无限次地完成交易，但是你每次交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。

返回获得利润的最大值。

示例 1:

输入: prices = [1, 3, 2, 8, 4, 9], fee = 2
输出: 8
解释: 能够达到的最大利润: 
在此处买入 prices[0] = 1
在此处卖出 prices[3] = 8
在此处买入 prices[4] = 4
在此处卖出 prices[5] = 9
总利润: ((8 - 1) - 2) + ((9 - 4) - 2) = 8.
        */
package lianxi0513;

public class test0513 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        System.out.println(s.maxProfit(prices,fee));
    }
}
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int B = 0;//获利
        int S = -prices[0];//买入的钱
        for(int i = 1; i< prices.length;i++){
            B = Math.max(B,S+prices[i]-fee);
            S = Math.max(S,B-prices[i]);
        }
        return B;
    }
}