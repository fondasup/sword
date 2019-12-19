import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MinNumByArray_45 {
    public static String minNumByArray(int[] data){
        ArrayList<String> sortData = new ArrayList<>();
        for(int i=0; i<data.length; i++){
            sortData.add(String.valueOf(data[i]));
        }
        Collections.sort(sortData, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String str1 = o1 + o2;
                String str2 = o2 + o1;
                return str1.compareTo(str2);
            }
        });
        StringBuilder result = new StringBuilder();
        for(String s: sortData){
            result.append(s);
        }
        return result.toString();
    }

    public static void main(String[] args){
        int[] test = new int[]{1,12,23,12};
        System.out.println(minNumByArray(test));
    }
}
