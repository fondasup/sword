package leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: yuwei
 * Date: 2019/12/28
 * Time: 23:18
 */
public class CombinationSum_LEE_39 {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    ArrayList<List<Integer>> res = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    Arrays.sort(candidates); //fixme  先排序会快很多；
    combinationSumCore(0,candidates, target, res, list, 0); // fixme 要传index 不然会有重复的结果
    return res;
  }
  public void combinationSumCore(int index, int[] candidates, int target, ArrayList<List<Integer>> res, ArrayList<Integer> list, int sum){
    for(int i=index; i<candidates.length; i++){
      if(sum + candidates[i] < target){
        list.add(candidates[i]);
        combinationSumCore(i,candidates, target, res, list, sum+candidates[i]);
        list.remove(list.size()-1);
      }else if(sum + candidates[i] == target){
        list.add(candidates[i]);
        res.add(new ArrayList(list));  // fixme 要新建一个list， 否则到最后都变成空了；
        list.remove(list.size()-1);
      }else{
        break;
      }
    }
  }
}
