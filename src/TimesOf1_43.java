public class TimesOf1_43 {
    public static int timesOf1(int n){
        int base = 1;
        int times = 0;
        int div = n;
        int tmpMod = 0;
        while(n / base > 0){
            tmpMod = div % 10;
            times = (tmpMod + 1) * times;
            if(tmpMod > 0){
                times += (n % base) + 1;
            }
            base *= 10;
            div /= 10;
        }
        return times;
    }

    public static void main(String[] args){
        int test = 99;
        System.out.println(timesOf1(test));
    }
}
