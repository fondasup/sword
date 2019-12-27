import java.util.ArrayList;
import java.util.List;

public class LetterCombinations_LEE_17 {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> res = new ArrayList<>();
        if(digits.length() == 0 ) return res;   // 这种特殊情况需要考虑， 否则输出的是[""], 而不是[]; 因为空的StringBUilder转为string为:"";
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("abc");
        strList.add("def");
        strList.add("ghi");
        strList.add("jkl");
        strList.add("mno");
        strList.add("pqrs");
        strList.add("tuv");
        strList.add("wxyz");

        StringBuilder sb = new StringBuilder();
        combinationsCore(res, 0, digits, sb, strList);
        return res;
    }

    public void combinationsCore(List<String> res, int index, String digits, StringBuilder sb, ArrayList<String> strList){
        if(digits.length() == index){
            res.add(sb.toString());
        }else{
            String str = strList.get(digits.charAt(index)-'2');
            for(int i=0;i<str.length();i++){
                sb.append(str.charAt(i));
                combinationsCore(res, index+1, digits,sb, strList);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
