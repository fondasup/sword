import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * User: yuwei
 * Date: 2019/12/22
 * Time: 14:11
 */
public class MaxInQueue_59 {

  public static List<Integer> maxInQueue(int[] data, int window){
    if(data.length < window || data == null || window <1) return null;

    ArrayList<Integer> res = new ArrayList<>();
    LinkedList<Integer> indexQueue= new LinkedList<>();
    for(int i=0; i<window; i++){
      while (!indexQueue.isEmpty() && data[i] >= data[indexQueue.getLast()]){
        indexQueue.removeLast();
      }
      indexQueue.add(i);
    }
    res.add(data[indexQueue.getFirst()]);
    for(int i=window; i<data.length; i++){
      if(i-indexQueue.getFirst() >= window){
        indexQueue.removeFirst();
      }
      while (!indexQueue.isEmpty() && data[i] >= data[indexQueue.getLast()]){
        indexQueue.removeLast();
      }
      indexQueue.add(i);
      res.add(data[indexQueue.getFirst()]);
    }
    return res;
  }

  public static void main(String[] args){
    int[] test = new int[]{2,3,4,2,6,2,5,1};
    System.out.print(maxInQueue(test, 3));
  }

}
