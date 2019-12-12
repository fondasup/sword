public class ReplaceSpace_5 {
    public static String replace(String data){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<data.length();i++){
            char tmp = data.charAt(i);
            if(tmp == ' '){
                result.append("%20");
            }else{
                result.append(tmp);
            }
        }
        return result.toString();
    }


    // fixme 从后面开始赋值
    public static String replace2(String data){
        int spaceCount = 0;
        for(int i=0; i<data.length();i++){
            if(data.charAt(i) == ' '){
                spaceCount ++;
            }
        }
        System.out.println(spaceCount);
        int newLen = data.length() + 2 * spaceCount;
        char[] result = new char[newLen];
        int i = newLen -1;
        int j = data.length() -1;
        while(j>=0){
            char tmp = data.charAt(j);
            if(tmp ==  ' ') {
                result[i--] = '%';
                result[i--] = '0';
                result[i--] = '2';
            }else {
                result[i--] = tmp;
            }
            j--;
        }
        return new String(result);
    }

    public static void main(String[] args){
        String test = "we are family";
        String result  = replace2(test);
        System.out.println(result);
    }
}
