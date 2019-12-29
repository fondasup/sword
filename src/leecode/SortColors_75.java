package leecode;

/**
 * User: yuwei
 * Date: 2019/12/29
 * Time: 22:54
 */
public class SortColors_75 {
  public void sortColors(int[] nums) {
    if(nums.length <= 1) return;
    int flag2 = nums.length-1;
    int flag0 = 0;
    while(flag2>=0 && nums[flag2] == 2){
      flag2 --;
    }
    while( flag0 <= flag2 && nums[flag0] == 0 ){
      flag0 ++;
    }
    int left = flag0;
    while(left <= flag2){
      if(nums[left] == 0){
        swap(nums, left, flag0);
        flag0 ++;
        while( flag0 <= flag2 && nums[flag0] == 0 ){
          flag0 ++;
        }

      }else if(nums[left] == 2){
        swap(nums, left, flag2);
        flag2 --;
        while(flag2>=0 && nums[flag2] == 2){
          flag2 --;
        }
        if(nums[left] == 0){ // fixme 注意换回来的有可能是0  不能直接移动left；
          swap(nums, left, flag0);
          flag0 ++;
          while( flag0 <= flag2 && nums[flag0] == 0 ){
            flag0 ++;
          }
        }
      }
      left = Math.max(left+1, flag0);  //fixme 不能单纯的left++
    }
  }

  public void swap(int[] nums, int n1, int n2){
    int tmp = nums[n1];
    nums[n1] = nums[n2];
    nums[n2] = tmp;
  }
}
