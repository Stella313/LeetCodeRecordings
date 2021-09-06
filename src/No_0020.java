import java.util.*;

public class No_0020 {
    public boolean isValid(String s) {
        Map<Character,Integer> ch = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        ch.put('(',1);
        ch.put('[',2);
        ch.put('{',3);
        ch.put(')',-1);
        ch.put(']',-2);
        ch.put('}',-3);
        for(int i = 0;i < s.length();i ++){
            if(ch.get(s.charAt(i)) > 0){
                System.out.println(s.charAt(i));
                stack.add(s.charAt(i));
            }else{
                if(stack.size() == 0){
                    return false;
                }
                char pop = stack.pop();
                if(ch.get(pop) == -(ch.get(s.charAt(i)))){
                    System.out.println(s.charAt(i));
                    continue;
                }else{
                    return false;
                }
            }
        }
        if(stack.size() != 0){
            // System.out.println(stack.pop());
            System.out.println(222);
            return false;
        }else{
            System.out.println(11111);
            return true;
        }
    }
}
