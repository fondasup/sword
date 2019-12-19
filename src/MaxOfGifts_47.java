import java.util.Arrays;

public class MaxOfGifts_47 {
    public static int maxValueOfGifts(int[][] gifts){
        if(gifts.length <= 0) return 0;
        int[] maxValues = new int[gifts[0].length];
        maxValues[0] = gifts[0][0];
        for(int i=1; i<maxValues.length;i++){
            maxValues[i] = gifts[0][i] + maxValues[i-1];
        }
        for(int r=1;r<gifts.length;r++){
            for(int c=0;c<gifts[0].length;c++){
                if(c==0){
                    maxValues[c] = maxValues[c] + gifts[r][c];
                }else{
                    maxValues[c] = Math.max(maxValues[c], maxValues[c-1]) + gifts[r][c];
                }
            }
        }
        return maxValues[maxValues.length-1];
    }
    public static void main(String[] args){
        int[][] test = new int[][]{
                {1,10,3,8},
                {12,2,9,6},
                {5,7,4,11},
                {3,7,16,5}
        };
        System.out.println(maxValueOfGifts(test));
    }
}
