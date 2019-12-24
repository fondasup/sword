import java.util.Arrays;
import java.util.Collections;

/**
 * User: yuwei
 * Date: 2019/12/22
 * Time: 16:20
 */
public class IsContinuous_61 {

  public static boolean isContinuous(int[] data){
    Arrays.sort(data);
    int numsOf0 = 0;
    for(int i=0; i<data.length-1;i++){
      if(data[0] == 0){
        numsOf0 ++;
      }else{
        int diff = data[i+1] - data[i];
        if(diff == 0) return false;
        else if(diff > 1){
          numsOf0 -= diff-1;
          if(numsOf0 < 0) return false;
        }
      }
    }
    return true;
  }
  public static void main(String[] args){
    int[] test = new int[]{2,3,4,6,0};
    System.out.println(isContinuous(test));
  }
}
