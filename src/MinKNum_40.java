import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinKNum_40 {
    public static int[] minKByPartition(int[] data, int k){
        int index = partition(data,0, data.length-1,k-1);
        while (index != k-1){
            if(index > k-1){
                index = partition(data, 0, index-1, k-1);
            }else{
                index = partition(data,index+1, data.length -1, k-1 );
            }
        }
        return data;
    }
    public static int partition(int[] data, int start, int end, int index){
        swap(start, index, data);
        int val = data[start];
        while (end > start){
            while (end > start && data[end] >= val){
                end--;
            }
            if(end > start){
                swap(start, end, data);
            }
            while (end>start && data[start] < val){
                start ++;
            }
            if(end > start){
                swap(start,end,data);
            }
        }
        return end;
    }
    public static void swap(int index1, int index2, int[] data){
        int tmp = data[index1];
        data[index1] = data[index2];
        data[index2] = tmp;
    }


    public static int[] minKByMaxHeap(int[] data, int k){
        if(data == null || data.length <= 0 || k==0) return null;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for(int i=0; i<data.length; i++) {
            if (maxHeap.size() < k) maxHeap.add(data[i]);
            else if (maxHeap.peek() > data[i]) {
                maxHeap.remove();
                maxHeap.add(data[i]);
            }
        }
        int[] result = new int[k];
        for (int i=0; i<k; i++){
            result[i] = maxHeap.remove();
        }
        return result;
    }


    public static void main(String[] args){
        int[] test = new int[]{3,4,5,6,1,2,7,0};
        System.out.println(Arrays.toString(minKByMaxHeap(test,2)));
    }
}
