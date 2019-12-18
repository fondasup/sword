import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianInStream_41 {
     public static double medianInStream(int[] data){
         if(data.length == 0) return 0;
         PriorityQueue<Integer> minHeap = new PriorityQueue<>();
         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
             @Override
             public int compare(Integer o1, Integer o2) {
                 return o2.compareTo(o1);
             }
         });
         for(int i=0; i<data.length; i++){
             if(i%2 == 0){
                 maxHeap.add(data[i]);
                 minHeap.add(maxHeap.remove());
             }else{
                 minHeap.add(data[i]);
                 maxHeap.add(minHeap.remove());
             }
         }
         if(data.length % 2==0){
             return (maxHeap.peek() + minHeap.peek())/2.0;
         }else{
             return maxHeap.peek();
         }
     }

     public static void main(String[] args){
         int[] test = new int[]{1,3,56,7,4,7,9,3};
         System.out.println(medianInStream(test));
     }


}
