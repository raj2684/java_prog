package dsa.progs;

/*
Given an array prices[] of length N, representing the prices of the stocks on different days, the task is to
 find the maximum profit possible by buying and selling the stocks on different days when at most one
 transaction is allowed.

Note: Stock must be bought before being sold.
 */
public class BuySellStocks {
    public static void main(String[] args) {
        int[] stocks = {7, 1, 5, 3, 6, 4};
        System.out.println("Highest profit :" + findMaxProfit(stocks));
    }

    private static int findMaxProfit(int[] stocks) {
        int buy = stocks[0];
        int profit = 0;
        for (int stock : stocks) {

            if (buy > stock) {
                buy = stock;
            } else {
                if (profit < (stock - buy)) {
                    profit = stock - buy;
                }
            }

        }
        return profit;
    }
}
