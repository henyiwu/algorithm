package offer;

/**
 * 剑指 Offer 63. 股票的最大利润
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * 示例 2:
 * <p>
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 * <p>
 * <p>
 * 限制：
 * <p>
 * 0 <= 数组长度 <= 10^5
 */
public class Title63 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {7, 6, 4, 3, 1};
        System.out.println(solution.maxProfit(arr));
    }

    static class Solution {
        public int maxProfit(int[] prices) {
            // 1. 构建逻辑二维数组，横向表示卖出，纵向表示买入(使用二维数组内存超出)
            int max = 0;
            for (int i = 0; i < prices.length; i++) {
                for (int j = i + 1; j < prices.length; j++) {
                    max = Math.max(max, prices[j] - prices[i]);
                }
            }
            max = Math.max(max, 0);
            return max;
        }
    }
}