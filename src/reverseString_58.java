/**
 * User: yuwei
 * Date: 2019/12/22
 * Time: 14:02
 */
public class reverseString_58 {

  public static String reverseString(String str){
    if(str == null) return null;
    String[] strs = str.split(" ");
    StringBuilder res = new StringBuilder();
    for(int i=strs.length-1; i>=0; i--){
      res.append(strs[i]);
      res.append(" ");
    }
    res.deleteCharAt(res.length()-1);
    return res.toString();
  }

  public static void main(String[] args){
    String test = "I";
    System.out.print(reverseString(test));
  }

}
