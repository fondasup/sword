/**
 * User: yuwei
 * Date: 2019/12/14
 * Time: 14:44
 */
public class MaxRopeCut_14 {
  // 动态规划算法
  public static int maxRope(int length){
    int[] ropeLens = new int[length + 1];
    ropeLens[0] = 1;
    ropeLens[1] = 1;
    ropeLens[2] = 2;
    ropeLens[3] = 3;
    for(int i=4; i<=length; i++){
      int max = 0;
      for(int j=0; j<=i/2; j++){
        max = Math.max(ropeLens[j]*ropeLens[i-j], max);
      }
      ropeLens[i] = max;
    }
    return ropeLens[length];
  }

  //贪婪算法
  public static int maxRope2(int length){
    if(length == 1) return 1;
    if(length % 3 == 1){
      return (int)Math.pow(3, length/3-1) * 4;
    }else{
      return (int)Math.pow(3, length/3) * (length%3);
    }

  }
  public static void main(String[] args){
    System.out.println(maxRope2(8));
  }
}
