import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         Arrays.sort(coins);
//         int numCoins = 0;
//         for (int i = coins.length; i > -1; i--) {
//             if (coins[i]>= amount) {
//                 int numOfCoin = amount/coins[i];
//                 amount-= numCoins*coins[i];
//             }
//         }       

//         if (amount!=0) {
//             return -1;
//         }

//         return numCoins;
//     }
// }

import java.util.*;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        // Initialize dp with a large number (impossible case)
        Arrays.fill(dp, amount + 1);
        dp[0] = 0; // base case: 0 coins to make amount 0

        for (int coin : coins) { // go through each coin denomination
            for (int i = coin; i <= amount; i++) { // only start when we can use that coin
                int oldValue = dp[i]; // store old dp value before update
                int newValue = dp[i - coin] + 1; // new possible value using this coin
                int diff = oldValue - newValue; // difference between old and new

                // If using this coin gives a smaller result, update dp[i]
                dp[i] = Math.min(oldValue, newValue);

                // Debug output (optional, helps to see progress)
                System.out.println("Coin: " + coin + ", Amount: " + i + 
                                   ", Old: " + oldValue + ", New: " + newValue + 
                                   ", Diff: " + diff + ", Result: " + dp[i]);
            }
        }

        // If dp[amount] is still greater than amount, it means not possible
        return dp[amount] <= amount ? dp[amount] : -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println("Minimum coins needed: " + sol.coinChange(coins, amount));
    }
}
