package Remove_Dups;

import java.util.Stack;

public class Solution {
    public String removeDuplicates(String s){
        Stack<Character> stack = new Stack<Character>();
        for(int i =0; i<s.length(); i++){
            if(stack.empty())
                stack.push(s.charAt(i));
            else{
                if(s.charAt(i)==stack.peek())
                    stack.pop();
                else
                    stack.push(s.charAt(i));
            }
        }
        StringBuilder k = new StringBuilder();
        for (char c: stack)
            k.append(c);
        return k.toString();
    }
}
