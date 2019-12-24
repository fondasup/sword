import java.util.Arrays;

/**
 * User: yuwei
 * Date: 2019/12/22
 * Time: 19:05
 */
public class Multiply_66 {

  public static int[] multiply(int[] array1, int[] array2){
    if(array1.length != array2.length || array1.length <= 0) return null;
    Arrays.fill(array2,1);
    for(int i=1; i<array1.length; i++){
      array2[i] = array2[i-1] * array1[i-1];
    }
    int tmp = 1;
    for(int i=array1.length-2;i>=0;i--){
      tmp *= array1[i+1];
      array2[i]*= tmp;
    }
    return array2;
  }

  public static void main(String[] args){
    int[] test = new int[]{1,2,3,4,5};
    int[] res = new int[test.length];
    multiply(test, res);
    System.out.println(Arrays.toString(res));
  }

}
