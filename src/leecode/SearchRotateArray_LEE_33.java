package leecode;

/**
 * User: yuwei
 * Date: 2019/12/28
 * Time: 22:26
 */
public class SearchRotateArray_LEE_33 {
  public int search(int[] nums, int target) {
    if(nums.length <= 0) return -1;
    int left = 0;
    int right = nums.length-1;
    int mid = 0;
    while(right>=left){
      mid = (right + left)/2;
      if(nums[mid] == target) return mid;
      else if(nums[mid]>=nums[left]){ // fixme 这里要有=
        if( target>=nums[left] && target <nums[mid]){
          right = mid-1;
        }else{
          left = mid +1;
        }
      }else{
        if(target > nums[mid] && target <= nums[right]){
          left = mid +1;
        }else{
          right = mid -1;
        }
      }
    }
    return -1;
  }
}
