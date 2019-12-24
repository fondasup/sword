import java.util.Arrays;

/**
 * User: yuwei
 * Date: 2019/12/22
 * Time: 15:43
 */
public class PointProbability_60 {

  public static void pointPro(int num){
    int maxValue = 6;
    int[] pro1 = new int[num*maxValue +1];
    int[] pro2 = new int[num*maxValue +1];
    Arrays.fill(pro1, 0);
    for(int i=1;i<=maxValue;i++){
      pro1[i] = 1;
    }
    Arrays.fill(pro2,0);
    for(int i=2; i<=num; i++){
      int[] copy1 = null;
      int[] copy2 = null;
      if(i%2==0){
        copy1 = pro1;
        copy2 = pro2;
      }else{
        copy1 = pro2;
        copy2 = pro1;
      }
      for(int j=1;j<=i*maxValue;j++){
        copy2[j] = 0;
        for(int k=1;k<=maxValue && (j-k) > 0; k++){
          copy2[j] += copy1[j-k];
        }
      }

    }
    if(num % 2 == 0){
      for(int n=1;n<=num*maxValue;n++){
        System.out.println(pro2[n]/Math.pow(maxValue,num));
      }
    }else{
      for(int n=1;n<=num*maxValue;n++){
        System.out.println(pro1[n]/Math.pow(maxValue,num));
      }
    }
  }

  public static void main(String[] args){
    pointPro(3);
  }



}
