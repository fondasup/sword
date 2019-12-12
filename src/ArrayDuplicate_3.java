import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicate_3 {
    //可以改变数组
    public static Integer[] duplacate(int[] data){
        HashSet<Integer> result = new HashSet<>();
        for(int i=0; i<data.length; i++){
            if(data[i] != i){
                int loc = data[i];
                if(loc == data[loc]){
                    result.add(loc);
                }else{
                    data[i] = data[loc];
                    data[loc] = loc;
                }
            }
        }
        return result.toArray(new Integer[result.size()]);
    }

    //不可以改变数组, 找任意一个重复的数;该方法是用时间换空间
    public static int duplicate(int[] data){
        int left = 0;
        int right = data.length;
        if (right == 0) return -1;
        int mid;
        while(right >= left){
            mid = (left + right) / 2;
            int count = 0;
            for(int i=0; i<data.length; i++){
                if(data[i] <= mid && data[i] >= left){
                    count ++;
                }
            }
            if(right == left && count > 1){
                return left;
            }
            if(count > mid-left+1){
                right = mid;
            }else {
                left = mid +1;
            }

        }
        return  -1;
    }


    public static void main(String[] args){
        int[] test = new int[]{1,2};
        int result = duplicate(test);
        System.out.println(result);
    }
}
