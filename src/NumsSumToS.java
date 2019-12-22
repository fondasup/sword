/**
 * User: yuwei
 * Date: 2019/12/22
 * Time: 13:44
 */
public class NumsSumToS {
  public static boolean numsSumTos(int[] data, int s){
    if(data == null || data.length < 2) return false;
    int left = 0;
    int right = data.length - 1;
    while (right > left){
      if(data[left] + data[right] == s){
        System.out.println(data[left]);
        System.out.println(data[right]);
        return true;
      }else if(data[left] + data[right] > s){
        right --;
      }else{
        left ++;
      }
    }
    return false;
  }

  public static void main(String[] args){
    int[] test = new int[]{1,2,4,7,11,15};
    numsSumTos(test, 15);
  }
}
