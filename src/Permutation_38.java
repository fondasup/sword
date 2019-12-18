import java.util.Arrays;

public class Permutation_38 {
    public static void permutation(String str){
        if(str == null || str.length() == 0) return;
        char[] data = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            data[i] = str.charAt(i);
        }
        permutationCore(0, data);
    }

    public static void permutationCore(int index, char[] data){
        if(index == data.length - 1){
            System.out.println(Arrays.toString(data));
        }else{
            char tmp = data[index];
            for(int i=index; i<data.length; i++){
                data[index] = data[i];
                data[i] = tmp;
                permutationCore(index + 1, data);
                data[i] = data[index];
                data[index] = tmp;
            }
        }
    }

    public static void combination(String str){
        StringBuilder sb = new StringBuilder();
        combinationCore(0, sb, str);
    }
    public static void combinationCore(int index, StringBuilder sb, String str){
        if(index == str.length()) {
            System.out.println(sb.toString());
            return;
        }
        sb.append(str.charAt(index));
        combinationCore(index+1, sb, str);
        sb.deleteCharAt(sb.length()-1);
        combinationCore(index+1,sb,str);

    }



    public static void main(String[] args){
        String test = "abcd";
        combination(test);
    }

}
