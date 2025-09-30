class Solution {
    public String intToRoman(int num) {
        String rv = "";
        int[] vals = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] rns = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        for (int i = 0; i < vals.length; i++) {
            while (num >= vals[i]) {
                System.out.println(num);
                int repeat = num / vals[i];
                num -= (repeat * vals[i]);
                rv += rns[i].repeat(repeat);
            }
        }

        return rv;
    }
}