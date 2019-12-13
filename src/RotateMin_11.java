public class RotateMin_11 {
    public static int rotateMin(int[] array){
//        if(array == null || array.length == 0) throw new Exception("Invalid");
        int left = 0;
        int right = array.length  - 1;
        int mid = (left + right )/2;
        while(right > left){
            if(array[mid] == array[left] && array[mid] == array[right]){
                for(int i = 2; i<= array.length; i++){
                    if(array[i] < array[i-1]){
                        return array[i];
                    }
                }
            }
            if(array[mid] >= array[left]){
                left = mid + 1;
            }else{
                right = mid;
            }
            mid = (left + right ) /2;
        }
        return array[left];
    }
    public static void main(String[] args){
        int[] test = new int[]{5};
        System.out.println(rotateMin(test));
    }
}
