import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> li = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(x == '(' ||x == '{' ||x == '[' )
                li.push(x);
            else{
                if(li.size()==0)
                    return false;
                char y = li.peek();
                if((y=='(' && x==')')||(y=='{' && x=='}')||(y=='[' && x==']'))
                    li.pop();
                else
                    return false;
            }

        }

        if(li.size()==0)
            return true;
        return false;
    }
}