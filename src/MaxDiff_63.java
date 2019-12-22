/**
 * User: yuwei
 * Date: 2019/12/22
 * Time: 18:26
 */
public class MaxDiff_63 {
  public static int maxDiff(int[] data){
    if(data == null || data.length <= 0) return -1;
    int min = data[0];
    int maxDiff = 0;
    for(int i=2;i<data.length; i++){
      if(data[i] < min){
        min = data[i];
      }else if(data[i] - min > maxDiff){
        maxDiff = data[i] - min;
      }
    }
    return maxDiff;
  }

  public static void main(String[] args){
    int[] test = new int[]{9,11,8,5,7,12,16,14};
    System.out.println(maxDiff(test));
  }
}
