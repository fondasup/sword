import java.util.Arrays;

public class MaxSubNoDupliation_48 {

    public static String maxSubWithoutDuplication(String str) {
        if (str == null || str.length() <= 0) return null;
        int[] mark = new int[25];
        Arrays.fill(mark, -1);
        int start = 0;
        int end = 0;
        int tmpStart = 0;
        int tmpEnd = 0;
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i) - 'a';
            if (mark[c] != -1) {
                if(mark[c] >= tmpStart) {
                    if ((tmpEnd - tmpStart) >= (end - start)) {
                        start = tmpStart;
                        end = tmpEnd;
                    }
                    tmpStart = mark[c] + 1;
                }
            }
            mark[c] = i;
            tmpEnd = i;
        }
        if ((tmpEnd - tmpStart) >= (end - start)) {  //这一步不能忘；
            start = tmpStart;
            end = tmpEnd;
        }
        return str.substring(start, end + 1);
    }


    public static void main(String[] args){
        String test = "qevnskdfnkjsfeqwqqfpvdvm";
        System.out.println(maxSubWithoutDuplication(test));
    }

}
