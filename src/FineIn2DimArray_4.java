public class FineIn2DimArray_4 {
    public static boolean find(int[][] data, int target){
        // fixme 记得对null的判断， 不要哟用二分法， 这道题目里面二分法是个坑
        if(data == null || data.length == 0) return false;
        int row = data.length;
        int col = data[0].length;
        int i = col - 1;
        while (i>=0){
            if(data[0][i] > target){
                i--;
            }else{
                break;
            }
        }
        if(i<0) return false;
        for(int j=0;j<row;j++){
            if(data[j][i] >= target){
                if(data[j][i] == target) return true;
                else break;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[][] test = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(find(test,8));
    }
}
