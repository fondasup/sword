/**
 * User: yuwei
 * Date: 2019/12/22
 * Time: 16:32
 */

// fixme  要背
public class LastInCircle_62 {
  public static int lastInCircle(int n, int m){
    if(n<1 || m<1) return -1;
    int last = 0;
    for(int i=2; i<=n;i++){
      last= (last+m)%i;
    }
    return last;
  }

  public static void main(String[] args){
    System.out.println(lastInCircle(5,3));
  }
}
