public class DigitAtIndex_44 {
    public static int digitAtIndex(int n){
        if(n <= 0) return -1;
        if(n<=10) return n-1;
        n -= 10;
        int base = 1;
        int count = 1;
        while(n > 0){
            base *= 10;
            count ++;
            n -= base * count * 9;
        }
        n += base * count * 9;
        int num = n / count + base;
        int mod = n % count;
        if(mod != 0){
            num ++;
            return (int)(num/Math.pow(10,count-mod) % 10);
        }else{
            return num % 10;
        }

    }

    public static void  main(String[] args){
        System.out.println(digitAtIndex(1001));
    }
}
