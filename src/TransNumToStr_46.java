public class TransNumToStr_46 {


    public static int transNumToStrCore(int num){
        if(num < 0) return -1;
        int f2 = 1;
        int f1 = 1;
        String numStr = String.valueOf(num);
        for(int i=numStr.length()-2; i>=0; i--){
            if(numStr.substring(i,i+1).compareTo("25") <= 0){
                int oF1 = f1;
                f1 = f1 + f2;
                f2 = oF1;
            }else{
                f2 = f1;
            }
        }
        return f1;
    }

    public static void main(String[] args){
        int test = 12258;
        System.out.println(transNumToStrCore(test));
    }
}
