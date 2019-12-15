/**
 * User: yuwei
 * Date: 2019/12/15
 * Time: 18:12
 */
public class Print1toMax_17 {
  static boolean valid = true;

  public static void print1toMax(int n){
    if(n<=0) {
      valid = false;
      return;
    }
    char[] num = new char[n];
    print1toMaxRecur(n,0, num);
  }

  public static void print1toMaxRecur(int n, int index, char[] num){
    if(index == n){
      print(num);
      return;
    }
    for(int i=0; i<10; i++){
      num[index] = (char)(i+'0');
      print1toMaxRecur(n, index+1, num);
    }
  }

  public static void print(char[] num){
    boolean flag = false;
    for(int i=0; i<num.length; i++){
      if(!flag && num[i] != '0'){
        flag = true;

      }
      if(flag){
        System.out.print(num[i]);
      }
    }
    System.out.print("\t");
  }

  public static void main(String[] args){
    print1toMax(3);
  }

}
