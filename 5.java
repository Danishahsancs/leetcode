class Solution {
    public int start=0;
    public int end=0;

    public String longestPalindrome(String s) {
        char[] ch = s.toCharArray();
        palindrome(ch, 0);
        return s.substring(start, end+1);
    }
    private void palindrome(char[] ch, int i){
        int left=i;
        int right=i;
        int n=ch.length;

        if(i>=n-1) return;

        while(right<n-1 && ch[right]==ch[right+1]){
            right++;
        }
        i=right;
        while(left>0 && right<n-1 && ch[left-1]==ch[right+1]){
            left--;
            right++;
        }
        if((end-start)<(right-left)){
            end=right;
            start=left;
        }
        palindrome(ch,i+1);
    }
}