public class No_0003 {
    public static int lengthOfLongestSubstring(String s) {
        int begin = 0;
        int end = 0;
        int len = 0;
        int rep = 0;
        for(int i = 0;i < s.length();i ++){
            end = i;
            for(int j = begin;j < end;j ++){
                if(begin == end)
                    break;
//                System.out.println(111);
                if(s.charAt(j) == s.charAt(i)){
                    if(end - begin  > len){
                        len = end - begin;
                    }
                    begin = j + 1;
                    end = i;
                    rep = 1;
                    break;
                }
            }
//            System.out.println("rep: " + rep);
            if(rep == 0){
                end = i;
                if(end - begin + 1 > len){
                    len = end - begin + 1;
                }
            }
//            System.out.println("end " + end);
//            System.out.println("begin " + begin);
//            if(end - begin + 1 > len){
//                len = end - begin + 1;
//            }
            rep = 0;
//            System.out.println(len);
        }
        return len;
    }
    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("bb"));
    }
}
