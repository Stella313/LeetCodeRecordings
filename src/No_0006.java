public class No_0006 {
    public String convert(String s, int numRows) {
        String [] str = s.split("");
        int count = 0;
        String result = "";
        String [][] matrix = new String[numRows][str.length / 2];
        for(int j = 0;j < matrix[0].length - 1;j ++){
            if(j % (numRows - 1) == 0){
                for(int i = 0;i < numRows;i ++){
                    matrix[i][j] = str[count];
                    count ++;
                }
            }else{
                matrix[numRows - 1 - j][j] = str[count];
                count ++;
            }
        }
        for(int i = 0;i < matrix.length;i ++){
            for(int j = 0;j < matrix[0].length;j ++){
                result += matrix[i][j];
            }
        }
        return result;
    }
}

