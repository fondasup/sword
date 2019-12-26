public class MaxPalindrome_LEE_5 {
    public String longestPalindrome(String s) {
        if(s.length() <= 1) return s;
        StringBuilder sb = new StringBuilder();
        sb.append('&');
        for(int i=0; i<s.length(); i++){
            sb.append('#');
            sb.append(s.charAt(i));
        }
        sb.append("#%");
        int[] p = new int[sb.length()];
        int maxLen = -1;
        int index = 0;
        p[0] = 1;
        int mx = 1;
        int pid = 0;
        for(int i=1;i<sb.length()-1; i++){
            p[i] = mx>i ? Math.min(p[pid*2-i], mx-i) : 1;
            while(sb.charAt(p[i]+i) == sb.charAt(i-p[i])){
                p[i] ++;
            }
            if(p[i] + i>mx){
                mx = p[i] + i;
                pid = i;
            }
            if(p[i]-1> maxLen){
                maxLen = p[i] - 1;
                index = i;
            }
        }
        int start = (index - maxLen)/2;
        return s.substring(start, start+maxLen);
    }
}
