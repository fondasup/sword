/**
 * User: yuwei
 * Date: 2019/12/14
 * Time: 16:07
 */
public class Numberof1_15 {
  public static int numberof1(int value){
    int count = 0;
    while(value != 0){
      count ++;
      value = value & (value -1);
    }
    return count;
  }

  public static void main(String[] args){
    System.out.println(Integer.toBinaryString(-15));//负数的表示方式是取反加一
    System.out.println(numberof1(-15));
  }
}
