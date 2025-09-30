import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;

        // for(int right = 0; right < s.length(); right++){
        //     System.out.println(s.substring(left, right+1));
        //     if (!set.contains(s.charAt(right))) {
        //         set.add(s.charAt(right));
        //     max = Math.max(max, (right-left)+1);
        //     } else {
        //         while (s.charAt(left)!=s.charAt(right)) {
        //             set.remove(s.charAt(left));
        //             left++;
        //         }

        //         set.remove(s.charAt(left));
        //         left++;
        //         set.add(s.charAt(right));
        //     }
        // }

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}