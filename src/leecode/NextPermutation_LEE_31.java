package leecode;

public class NextPermutation_LEE_31 {
    public void nextPermutation(int[] nums) {
        if(nums.length <2) return;
        int index = nums.length-2;
        while(index>=0){
            if(nums[index] < nums[index+1]){
                break;
            }
            index --;
        }
        if(index >= 0){
            for(int i=nums.length-1; i>index;i--){  // fixme 注意尾部已经是确认是降序排列， 不需要再进行排序；
                if(nums[i] > nums[index]){
                    int tmp= nums[i];
                    nums[i]= nums[index];
                    nums[index] = tmp;
                    break;
                }
            }
        }
        int left = index +1;
        int right = nums.length-1;
        while(right>left){
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left ++;
            right --;
        }
    }
}
