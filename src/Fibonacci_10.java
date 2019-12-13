
// fixme 不可以用递归方式，因为本题目的递归有很多重复的节点
public class Fibonacci_10 {
    public static int fabonacci(int n){
        int f0 = 0;
        int f1 = 1;
        int result = 0;
        for(int i=2;i<=n;i++){
            result = f0 + f1;
            f0 = f1;
            f1 = result;
        }
        return result;
    }

    public static void main(String[] args){
        int n = 10;
        System.out.println(fabonacci(n));
    }
}
