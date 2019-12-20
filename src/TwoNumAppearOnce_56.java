public class TwoNumAppearOnce_56 {

    public static void twoNumsOnce(int[] data){
        if(data == null || data.length <= 0) return;
        int xOr = data[0];
        for(int i=1; i<data.length; i++){
            xOr ^= data[i];
        }
        int bit1 = 1;
        while ((xOr & bit1) == 0){
            bit1 <<= 1;
        }
        int num1 = 0;
        int num2 = 0;
        for(int i=0; i<data.length; i++){
            if((data[i] & bit1) != 0){
                num1 ^= data[i];
            }else{
                num2 ^= data[i];
            }
        }
        System.out.println(num1);
        System.out.println(num2);
    }

    public static void main(String[] args){
        int[] test = new int[]{2,4,3,6,3,2,5,5};
        twoNumsOnce(test);
    }
}
