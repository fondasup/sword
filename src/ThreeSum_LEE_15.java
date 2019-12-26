import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_LEE_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int left = 1;
        int right = 0;
        for(int i=0; i<nums.length -2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;  //注意去除重复
            if(nums[i] > 0) break;  //注意剪枝
            left = i+1;
            right = nums.length -1;
            while(right > left){
                int tmpTar = nums[left] + nums[right] + nums[i];
                if(tmpTar == 0){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    left ++;
                    right --;
                    while(right > left && nums[left] == nums[left-1]){  //注意去除重复
                        left ++;
                    }
                    while(right > left && nums[right] == nums[right+1]){
                        right --;
                    }
                }else if(tmpTar < 0){
                    left ++;
                }else right --;
            }
        }
        return res;
    }
}
