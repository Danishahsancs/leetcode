import java.util.Arrays;


class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] answer = new int[nums.length - k + 1];
        int curmaxindex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (i<k-1) {
                curmaxindex = nums[i]>nums[curmaxindex] ? i : curmaxindex;
            }
            if (i >= k - 1) {
                
                answer[i - k + 1] = findMax(Arrays.copyOfRange(nums, i - k + 1, i + 1));
            }

        }

        return answer;
    }

    public int findMax(int[] nums) {
        int max = nums[0];

        for (int i : nums) {
            max = Math.max(max, i);
        }

        return max;
    }
}