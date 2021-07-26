import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test002 {
    public ArrayList<ArrayList<String>> frequentWords (String content) {
        // write code here
        String[] array1 = content.split(".");
        ArrayList<String> words = new ArrayList<String>();
        for(int i = 0;i < array1.length;i ++){
            if(array1[i].split(",").length == 2){
                words.add(array1[i].split(",")[0]);
                words.add(array1[i].split(",")[1]);
            }else if(array1[i].split("!").length == 2){
                words.add(array1[i].split("!")[0]);
                words.add(array1[i].split("!")[1]);
            }else{
                words.add(array1[i]);
            }
        }
        Map<String, Integer> oneword = new HashMap<>();
        Map<String, Integer> twoword = new HashMap<>();
        Map<String, Integer> threeword = new HashMap<>();
        //one
        for(int i = 0;i < words.size();i ++){
            String[] tmp = words.get(i).split(" ");
            for(int j = 0;j < tmp.length;j ++){
                if(oneword.containsKey(tmp[j])){
                    int freq = oneword.get(tmp[j]);
                    oneword.put(tmp[j], freq + 1);
                }else {
                    oneword.put(tmp[j],1);
                }
            }
        }
        //two
        for(int i = 0;i < words.size();i ++){
            String[] tmp = words.get(i).split(" ");
            int j = 0;
            int k = j + 1;
            while(k < tmp.length - 1){
                String tmpS = tmp[j] + " " + tmp[k];
                if(twoword.containsKey(tmpS)){
                    int freq = oneword.get(tmpS);
                    twoword.put(tmpS, freq + 1);
                }else {
                    twoword.put(tmpS,1);
                }
                j++;
                k++;
            }
        }

        int max = 0;
        for (String key : oneword.keySet()) {
            if(oneword.get(key) > max){
                max = oneword.get(key);
            }
        }
        ArrayList<String> one = new ArrayList<>();
        ArrayList<String> two = new ArrayList<>();
        ArrayList<String> three = new ArrayList<>();
        ArrayList<ArrayList<String>> all = new ArrayList<>();
        for (String key : oneword.keySet()) {
            if(oneword.get(key) == max){
                one.add(key);
            }
        }
        all.add(one);
        all.add(two);
        all.add(three);
        return all;

    }
}
