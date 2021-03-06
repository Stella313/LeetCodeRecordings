import java.util.Arrays;

public class No_0611 {
    public int triangleNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0;i < nums.length - 2;i ++){
            int k = i + 2;
            for(int j = i + 1;j < nums.length && nums[i] != 0; j ++){
                while(k < nums.length && nums[i] + nums[j] > nums[k]){
                    k ++;
                }
                count += k - j - 1;
            }
        }
        return count;
    }
}
