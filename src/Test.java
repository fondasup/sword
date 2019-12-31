import javafx.util.Pair;

import java.util.*;

public class Test {

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] array = new int[10];
        String str = "33";
        char[] strA = str.toCharArray();
        String[] strArray = new String[]{"1", "2"};
        Arrays.sort(strArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        map.put(1,1);

    }
}
