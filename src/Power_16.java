/**
 * User: yuwei
 * Date: 2019/12/14
 * Time: 22:16
 */
public class Power_16 {
  static boolean validInput = true;

  public static double power(double base, int exponent){
    boolean isMin = false;
    if(exponent == Integer.MIN_VALUE){
      isMin = true;
      exponent += 1;
    }
    if(Double.compare(base, 0) == 0 ){
      if(exponent < 0 ) {
        validInput = false;
        return 0;
      }
    }
    if(exponent == 0){
      return 1;
    }
    int absExponent = exponent>=0? exponent: -exponent;
    double res = 1;
    double cur = base;
    while(absExponent > 0){
      if((absExponent&1)==1){
        res*=cur;
      }
      cur*=cur;
      absExponent >>= 1;
    }
    if(isMin){
      res*= base;
    }


    return exponent>0?res:1/res;
  }

  public static void main(String[] args){
    int test = Integer.MAX_VALUE;
//    System.out.println(Integer.toBinaryString(test>>1));
//    System.out.println(test);
//    System.out.println((-test) & 1);
    System.out.println(Math.pow(0,0));
    System.out.println(power(0,0));
  }
}
