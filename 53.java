class Solution {
    public int maxSubArray(int[] nums) {
        // int maxAnswer = nums[0];

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i]> maxAnswer)
        //         maxAnswer = nums[i];
        //     int temp = nums[i];
        //     for(int j = i+1; j < nums.length; j++){
        //         temp+=nums[j];
        //         if(temp> maxAnswer){
        //             maxAnswer = temp;
        //         }
        //     }
        // }

        // return maxAnswer;

        int maxSum = nums[0]; // tracks a total sum 
        int curSum = nums[0]; // tracks current subarray 

        for(int i = 1; i < nums.length;i++){
            int temp = curSum + nums[i]; /// grabs the next subarray

            if(temp>nums[i]){///checks if new subarray or continue the same
                curSum = temp;
            }else{
                curSum = nums[i];
            }

            if(curSum>maxSum){//checks if subarray greater then max
                maxSum =curSum;
            }
        }

        return maxSum;
    }
}