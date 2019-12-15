/**
 * User: yuwei
 * Date: 2019/12/15
 * Time: 19:51
 */
public class Match_19 {
  static int strLen;
  static int patterLen;

  public static boolean match(String str, String pattern, int strIndex, int patternIndex){
    if(strIndex == strLen && patternIndex == patterLen) return true;
    if(patternIndex == patterLen && strIndex < strLen) return false;
    if(patterLen - patternIndex > 1 && pattern.charAt(patternIndex) == '*'){
      if(pattern.charAt(patternIndex) == '.' || (strLen > strIndex && str.charAt(strIndex) == pattern.charAt(patternIndex))){
        return match(str, pattern, strIndex, patternIndex+2) || match(str, pattern, strIndex+1,patternIndex);
      }else{
        return match(str, pattern, strIndex, patternIndex + 2);
      }
    }else if(pattern.charAt(patternIndex) == '.' || (strLen > strIndex && str.charAt(strIndex) == pattern.charAt(patternIndex))){
      return match(str, pattern, strIndex+1, patternIndex +1);
    }else{
      return false;
    }
  }

  public static void main(String[] args){
    String testStr = "aaa";
    String testPattern = "a.a";
    strLen = testStr.length();
    patterLen = testPattern.length();
    System.out.print(match(testStr,testPattern,0,0));
  }
}
