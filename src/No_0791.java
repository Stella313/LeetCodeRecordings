import java.util.HashMap;
import java.util.Map;

public class No_0791 {
    public String customSortString(String order, String s) {
        Map<String,Integer> map = new HashMap<>();
        String[] strO = order.split("");
        String[] strS = s.split("");
        String result = new String();
        for(int i = 0;i < strO.length;i ++){
            map.put(strO[i],i);
        }
        for(int i = 0;i < strS.length;i ++){
            if(!map.containsKey(strS[i])){
                map.put(strS[i],-1);
            }
        }
        for(int i = 0;i < strS.length;i ++){
            for(int j = i + 1;j < strS.length;j ++){
                if(map.get(strS[i]) > map.get(strS[j])){
                    String tmp = strS[i];
                    strS[i] = strS[j];
                    strS[j] = tmp;
                }
            }
        }
        for(int i = 0;i < strS.length; i ++){
            result = result +strS[i];
        }
        return result;

    }
}
