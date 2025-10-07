class Solution {
    public String longestPalindrome(String s) {

        String ls = "";
        for (int l = 0; l < s.length(); l++) {
            for (int r = l; r < s.length(); r++) {
                if (ispal(s, l, r) && (r - l) + 1 > ls.length()) {
                    ls = s.substring(l, r + 1);
                }
            }
        }

        return ls;
    }

    public boolean ispal(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}