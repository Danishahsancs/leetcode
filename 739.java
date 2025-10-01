class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int days = 1;
            boolean warmfound = false;

            while (i + days < temperatures.length) {
                if (temperatures[i + days] > temperatures[i]) {
                    warmfound = true;       
                    break;                  
                }
                days++;
            }

            answer[i] = warmfound ? days : 0;
        }

        return answer;
    }
}
