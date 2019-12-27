package leecode;

public class LongestValidPparentheses_32 {


    // fixme 利用stack的方式， 是保留了前一个无用位置作为栈底， 从而得到长度；
    public int longestValidParentheses(String s) {
        int max = 0;
        int left = 0;
        int right = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == '('){
                left ++;
            }else{
                right ++;
            }
            if(left == right) max = Math.max(left *2, max);
            if(right > left){
                left = 0;
                right = 0;
            }
        }
        left = 0;
        right = 0;
        for(int i=s.length()-1; i>=0;i--){
            if(s.charAt(i) == '('){
                left ++;
            }else{
                right ++;
            }
            if(left == right) max = Math.max(left *2, max);
            if(left > right){
                left = 0;
                right = 0;
            }
        }
        return max;
    }
}
