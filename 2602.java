import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Long> minOperations(int[] nums, int[] queries) {
        List<Long> answer = new ArrayList<>();
        
        for(int i = 0; i < queries.length; i++){
            int operations = 0;
            for (int num : nums) {
                operations+= Math.abs(num-queries[i]);
            }
            answer.add((long)operations);
        }

        return answer;
    }
}