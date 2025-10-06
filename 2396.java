class Solution {
    public boolean isStrictlyPalindromic(int n) {
        
        for (int x = 2; x <= n - 2; x++) {
            String binary = Integer.toString(n, x);
            int i = 0;
            int j = binary.length() - 1;
            while (i < j) {
                if (binary.charAt(i) != binary.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
        }

        return true;
    }
}