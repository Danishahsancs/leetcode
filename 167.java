import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Map<Integer, Integer> set = new HashMap<>();

        // for (int i = 0; i < numbers.length; i++) {
        // set.put(numbers[i], i);
        // }

        // for (int i = 0; i < numbers.length; i++) {
        // int lookingFor = target - numbers[i];

        // if (set.containsKey(lookingFor)) {
        // return new int[] {i+1, set.get(lookingFor)+1};
        // }
        // }
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[] { i + 1, j + 1 };
            }

            if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return new int[] { -1, -1 };
    }
}