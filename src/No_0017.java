import java.util.*;

public class No_0017 {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if(digits.length() == 0){
            return combinations;
        }
        Map<String,String> map = new HashMap<>();
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        backtrack(map, 0, digits, combinations, "");
        return combinations;
    }
    public void backtrack(Map<String,String> map, int index, String digits, List<String> combinations, String prefix){
        if(index >= digits.length()){
            combinations.add(prefix);
            return;
        }
        String digit = String.valueOf(digits.charAt(index));
        String letters = map.get(digit);
        for(int i = 0;i < letters.length();i ++){
            prefix += letters.charAt(i);
            backtrack(map, index + 1, digits, combinations, prefix);
            prefix = prefix.substring(0,prefix.length() - 1);
        }
    }

    public List<String> letterCombinations2(String digits) {
        List<String> combinations = new ArrayList<>();
        if(digits.length() == 0){
            return combinations;
        }
        Map<String,String> map = new HashMap<>();
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        Queue<String> queue = new LinkedList<>();
        for(int i = 0;i <digits.length();i ++){
            conductQueue(queue, map.get(String.valueOf(digits.charAt(i))));
        }
        for(String string: queue){
            combinations.add(string);
        }
        return combinations;
    }
    public Queue<String> conductQueue(Queue<String> queue, String letters){
        int len = queue.size();
        if(len == 0){
            for(int i = 0;i < letters.length();i ++){
                queue.add(String.valueOf(letters.charAt(i)));
            }
        }
        for(int i = 0;i < len;i ++){
            String tmp = queue.poll();
            for(int j = 0;j < letters.length();j ++){
                queue.add(tmp + letters.charAt(j));
            }
        }
        return queue;
    }

}
