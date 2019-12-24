/**
 * User: yuwei
 * Date: 2019/12/22
 * Time: 18:38
 */
public class Add_65 {
  public static int add(int a, int b){
    int sum;
    int carry;
    do{
      sum = a^b;
      carry = (a&b)<<1; //fixme  <<的优先级比&高，记得一定要加括号；
      a = sum;
      b = carry;
    }while(carry != 0);
    return sum;
  }

  public static void main(String[] args){
    System.out.println(add(10,5));
  }
}
