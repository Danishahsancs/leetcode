
class Solution {
    public int divide(int dividend, int divisor) {

        boolean neg = dividend < 0 ^ divisor < 0;
        int i = 0;

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        while (a >= b) {
            a -= b;
            i++;
        }

        return neg ? -i : i;
    }
}