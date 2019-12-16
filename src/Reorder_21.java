import java.util.Arrays;

public class Reorder_21 {

    public static void reorder(int[] data){
        if(data == null || data.length == 0) return;
        int begin = 0;
        int end = data.length -1;
        while (end>begin){
            while(data[begin]%2 == 1){
                begin ++;
            }
            while (data[end]%2 == 0){
                end --;
            }
            //这里移动完之后可能会出现end< begin  但是还是会交换  因此要加判断！！！！
            if(end > begin) {
                int tmp = data[begin];
                data[begin] = data[end];
                data[end] = tmp;
                begin++;
                end --;
            }
        }

        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args){
        int[] test = new int[]{1,2,3,4,5};
        reorder(test);
    }
}
