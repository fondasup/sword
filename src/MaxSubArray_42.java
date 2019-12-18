public class MaxSubArray_42 {

    public static int maxSubArray(int[] data){
        int max = Integer.MIN_VALUE;
        int curValue = 0;
        for(int i=0;i<data.length;i++){
            if(curValue <= 0){
                curValue = 0;
            }
            curValue += data[i];
            if(curValue > max){
                max = curValue;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] test = new int[]{1,-2,3,10,-4,7,2,-5};
        System.out.println(maxSubArray(test));
    }
}
