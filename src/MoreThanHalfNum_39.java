public class MoreThanHalfNum_39 {
    public static int moreThanHalfNum(int[] array){
        if(array == null || array.length <= 0) return -1;
        int result = array[0];
        int times = 1;
        for(int i=1; i< array.length; i++){
            if(array[i] == result){
                times ++;
            }else{
                times --;
                if(times == 0){
                    result = array[i];
                    times = 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test = new int[]{1,2,2,3,4,2,5,2,2};
        System.out.println(moreThanHalfNum(test));
    }
}
