import java.util.Arrays;

public class No_0016 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int bestSum = 10000;
        int n = nums.length;
        for(int i = 0;i < n;i ++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    return target;
                }
                if(Math.abs(sum - target) < Math.abs(bestSum - target)){
                    bestSum = sum;
                }
                if(sum < target){
                    j ++;
                }else{
                    k --;
                }
            }
        }
        return bestSum;
    }
}
