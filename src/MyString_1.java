import java.util.Arrays;

public class MyString_1 {
    private char[] m_pData;
    MyString_1(char[] pData){
        m_pData = pData.clone();
    }



    public static void main(String[] args){
       char[] a = new char[]{'a', 'b'};
       char[] b = a.clone();
       b[0] = '0';
       System.out.println(Arrays.equals(a,b));
       System.out.println(a);
       System.out.println(b);

    }
}


