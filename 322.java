import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        // Arrays.sort(coins);
        // int numCoins = 0;
        // for (int i = coins.length; i > -1; i--) {
        // if (coins[i]>= amount) {
        // int numOfCoin = amount/coins[i];
        // amount-= numCoins*coins[i];
        // }
        // }

        // if (amount!=0) {
        // return -1;
        // }

        // return numCoins;

        int[] temp = new int[amount + 1];
        Arrays.fill(temp, amount + 1);
        temp[0] = 0;

        for (int i = 0; i < temp.length; i++) {
            for (int coin : coins) {
                if (i >= coin)
                    temp[i] = Math.min(temp[i], temp[i - coin] + 1);
            }
        }

        return temp[amount] > amount ? -1 : temp[amount];
    }
}