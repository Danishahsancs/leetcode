import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> map = new HashMap<>();

       for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
       }

       List<Map.Entry<Integer,Integer>> li = new ArrayList<>(map.entrySet());

       li.sort((a,b)-> b.getValue().compareTo(a.getValue()));

       int[] answer = new int[k];

       for (int i = 0; i < answer.length; i++) {
            answer[i] = li.get(i).getKey();
       }
       
       return answer;
    }
}