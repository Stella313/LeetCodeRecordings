import java.util.HashMap;

public class No_0205 {
    public boolean isIsomorphic(String s, String t) {
        String [] arrS = s.split("");
        String [] arrT = t.split("");
        if(arrS.length != arrT.length)
            return false;
        HashMap<String,String> sMap = new HashMap<>();
        for(int i = 0;i < arrS.length;i ++){
            if(!sMap.containsKey(arrS[i])){
                System.out.println(arrS[i]);
                if(sMap.containsValue(arrT[i])){
                    return false;
                }
                sMap.put(arrS[i],arrT[i]);
            }else{
                if(!sMap.get(arrS[i]).equals(arrT[i])){
                    return false;
                }
            }
        }
        return true;
    }
}
