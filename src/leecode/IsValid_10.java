package leecode;

import java.util.HashMap;
import java.util.Stack;

public class IsValid_10 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        for(int i=0;i<s.length();i++){
            char t = s.charAt(i);
            if(map.containsKey(t)){
                stack.push(t);
            }else{
                if(stack.isEmpty() || map.get(stack.pop()) != t){
                    return false;
                }

            }
        }
        if(stack.isEmpty()){  // fixme 这里万分注意
            return true;
        }else{
            return false;
        }
    }
}
