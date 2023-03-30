import java.util.List;
import java.util.Stack;
import java.util.Set;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

class Solution 
{
    public boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<>();

        Map<Character,Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');

        if(s.length() % 2 != 0)
        {
            return false;
        }

        for(Character c : s.toCharArray())
        {
            if(map.keySet().contains(c))
            {
                stack.push(c);
            }
            else
            {
                if(stack.size() > 0 && map.get(stack.peek()) == c)
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }

        if(stack.size() > 0)
        {
            return false;
        }
        return true;
    }
}