import java.util.Arrays;

class Solution {
    public int change(int amount, int[] coins) {
        int[] temp = new int[amount+1];
        Arrays.fill(temp, 0);
        temp[0] = 1;

        for (int coin : coins) {
            for (int i = 0; i < temp.length; i++) {
                if(i>=coin)
                    temp[i]+=temp[i-coin];
            }
        }

        return temp[amount];
    }
}