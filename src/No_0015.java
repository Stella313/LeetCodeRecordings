import java.util.LinkedList;
import java.util.List;

public class No_0015 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if(nums == null || nums.length < 3){
            return new LinkedList<>();
        }
        for(int i = 0;i < nums.length - 1;i ++){
            for(int j = 0;j < nums.length - 1 - i;j ++){
                if(nums[j] > nums[j + 1]){
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
//        for(int i = 0;i < nums.length;i ++){
//            System.out.print(nums[i] + " ");
//        }
//        System.out.println();
        for(int i = 0;i < nums.length - 2;i ++){
//            System.out.println("i: " + i);
            while(i != 0 && nums[i] == nums[i - 1]){
               i ++;
               if(i >= nums.length - 2)
                   return result;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
//                System.out.println("j: " + j);
//                System.out.println("k: " + k);
                while(i != j - 1 && nums[j] == nums[j - 1]){
                    j ++;
                    if(j >= k)
                        break;
                }
                if(j >= k)
                    break;
                while(k != nums.length - 1 && nums[k] == nums[k + 1]){
                    k --;
                    if(k <= j)
                        break;
                }
                if(k <= j)
                    break;
                if(nums[i] + nums[j] + nums[k] == 0){
                    List<Integer> append = new LinkedList<>();
                    append.add(nums[i]);
                    append.add(nums[j]);
                    append.add(nums[k]);
                    result.add(append);
                    j ++;
                    k --;
                }else if(nums[i] + nums[j] + nums[k] < 0){
                    j ++;
                }else{
                    k --;
                }
            }
        }
        return result;
    }
}
