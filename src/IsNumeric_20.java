public class IsNumeric_20 {
    public static boolean isNumeric(String str){
        if(str == null || str.length() == 0) return false;
        if(str.charAt(0) == '.') return unsignedInt(str.substring(1), 2);
        return signedInt(str, 1);
    }

    public static boolean unsignedInt(String str, int type){
        if(str.equals("")) return false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){;}
            else {
                if(type == 1){
                    if(str.charAt(i) == 'e' || str.charAt(i) == 'E'){
                        return signedInt(str.substring(i+1), 2);// type代指小数点后面的有符号数；
                    }else if(str.charAt(i) == '.'){
                        str = str.substring(i+1);
                        if(str.equals("") ){
                            return true;
                        }else if(str.charAt(0) == 'e' || str.charAt(0) == 'E'){
                            return signedInt(str.substring(1), 2);
                        }else{
                            return unsignedInt(str, 2);
                        }
                    }else{
                        return false;
                    }
                }else if(type == 2){
                    if(str.charAt(i) == 'e' || str.charAt(i) == 'E'){
                        return signedInt(str.substring(i+1), 3);// type代指小数点后面的有符号数；
                    }else return false;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean signedInt(String str, int type){
        if(str.equals("")) return false;
        if(str.charAt(0) == '+' || str.charAt(0) == '-') str=str.substring(1);
        return unsignedInt(str, type);
    }

    public static void main(String[] args){
        String test = "-12";
        System.out.println(isNumeric(test));
    }


}
