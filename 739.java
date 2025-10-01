import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];

        // for (int i = 0; i < temperatures.length; i++) {
        // int days = 1;
        // boolean warmfound = false;

        // while (i + days < temperatures.length) {
        // if (temperatures[i + days] > temperatures[i]) {
        // warmfound = true;
        // break;
        // }
        // days++;
        // }

        // answer[i] = warmfound ? days : 0;
        // }

        //[73,74,75,71,69,72,76,73]

        //current stack: 0(73), 1(74), 
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < temperatures.length; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                int temp = stack.pop();
                answer[temp] = i - temp;
            }
            stack.push(i);

        }

        return answer;
    }
}
