public class GetUglyNum_49 {

    public static int getUglyNum(int index){
        if(index <= 0) return -1;
        int[] uglys = new int[index];
        uglys[0] = 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        for(int i=0; i<index-1; i++){
            while (uglys[index2] * 2<= uglys[i]){
                index2++;
            }
            while (uglys[index3] * 3<= uglys[i]){
                index3++;
            }
            while (uglys[index5] * 5<=uglys[i]){
                index5++;
            }

            int min = Math.min(Math.min(uglys[index2]*2, uglys[index3]*3), uglys[index5]*5);
            uglys[i+1] = min;
        }
        return uglys[uglys.length-1];
    }

    public static void main(String[] args){
        System.out.println(getUglyNum(1500));
    }
}
