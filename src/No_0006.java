public class No_0006 {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() == 1) {
            return s;
        }
        String [] str = s.split("");
        int count = 0;
        String result = "";
        String [][] matrix = new String[numRows][str.length];
        for(int j = 0;j < matrix[0].length;j ++){
            if(j % (numRows - 1) == 0){
                for(int i = 0;i < numRows;i ++){
                    if(count >= str.length)
                        break;
                    matrix[i][j] = str[count];
                    count ++;
                }
            }else{
                if(count >= str.length)
                    break;
                matrix[numRows - 1 - j % (numRows - 1)][j] = str[count];
                count ++;
            }
        }
        for(int i = 0;i < matrix.length;i ++){
            for(int j = 0;j < matrix[0].length;j ++){
                if(matrix[i][j] != null){
                    result += matrix[i][j];
                }
            }
        }
        return result;
    }
}

