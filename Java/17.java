import java.util.*;
class Solution 
{
    public List<String> letterCombinations(String digits) 
    {
        List<String> combos = new ArrayList<>();
        Map<Character, String> dict = new HashMap<>();
        
        dict.put('2', "abc");
        dict.put('3', "def");
        dict.put('4',"ghi");
        dict.put('5',"jkl");
        dict.put('6',"mno");
        dict.put('7',"pqrs");
        dict.put('8',"tuv");
        dict.put('9',"wxyz");

        combos.add("");
        for(char digit : digits.toCharArray())
        {
            List<String> newCombos = new ArrayList<>();
            for(String combo : combos)
            {
                for(char letter: dict.get(digit).toCharArray())
                {
                    newCombos.add(combo + String.valueOf(letter));
                }
            }   

            combos.addAll(newCombos); 
        }

        List<String> results = new ArrayList<>();
        for(String combo : combos)
        {
        if(combo.length() == digits.length() && combo.length() > 0)
            {
                results.add(combo);
            }
        }

        return results;
    }
}