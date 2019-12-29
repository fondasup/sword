package leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * User: yuwei
 * Date: 2019/12/29
 * Time: 15:39
 */
public class GroupAnagrams_49 {
  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();
    ArrayList<List<String>> res = new ArrayList<>();
    for(int i=0; i<strs.length;i++){
      char[] tmp = strs[i].toCharArray();
      Arrays.sort(tmp);
      String tmpStr = String.valueOf(tmp); // fixme 此处不能用toString， 没有用 ，toString之后是一个地址
      if(!map.containsKey(tmpStr)){
        map.put(tmpStr,new ArrayList<String>());
      }
      map.get(tmpStr).add(strs[i]);

    }
    map.values().forEach(v->{
      res.add(v);
    });
    return res;
  }
}
