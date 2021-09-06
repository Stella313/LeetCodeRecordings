public class No_0032 {
    public int longestValidParentheses(String s) {
        int begin = 0;
        int close = 0;
        int result1 = 0;
        int result2 = 0;
        if(s.length() == 0){
            return 0;
        }
        for(int i = 0;i < s.length();i ++){
            if(s.charAt(i) ==  '('){
                begin ++;
            }else{
                close ++;
            }
            if(begin - close == 0){
                result1 = Math.max(result1, 2 * close);
            }else if(begin < close){
                begin = 0;
                close = 0;
            }
        }
        for(int i = s.length() - 1;i >=0;i --){
            if(s.charAt(i) ==  '('){
                begin ++;
            }else{
                close ++;
            }
            if(begin - close == 0){
                result2 = Math.max(result2, 2 * begin);
            }else if(begin > close){
                begin = 0;
                close = 0;
            }
        }

        return (Math.max(result1, result2));
    }
}
