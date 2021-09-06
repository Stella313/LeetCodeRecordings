import java.util.LinkedList;
import java.util.List;

public class No_0022 {
    public List<String> generateParenthesis(int n) {
        List<List<String>> total = new LinkedList<>();
        List<String> empty = new LinkedList<>();
        List<String> first = new LinkedList<>();
        first.add("()");
        empty.add("");
        total.add(empty);
        total.add(first);
        if(n == 0){
            return new LinkedList<String>();
        }
        if(n == 1){
            return first;
        }

        for(int i = 2;i < n + 1;i ++){
            List<String> tmp = new LinkedList<>();
            for(int j = 0;j < i;j ++){
                List<String> list1 = total.get(j);
                List<String> list2 = total.get(i - 1 - j);
                for(String st1: list1){
                    for(String str2: list2){
                        String add = "(" + st1 + ")" + str2;
                        tmp.add(add);
                    }
                }
            }
            total.add(tmp);

        }
        return total.get(n);
    }
}
