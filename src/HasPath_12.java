import java.util.Arrays;

public class HasPath_12 {
    public static boolean hasPath(char[][] matrix, String target){
        if(matrix == null || matrix.length == 0) return false;
        int rows = matrix.length;
        int clos = matrix[0].length;
        boolean[][] mark = new boolean[rows][clos]; //boolean初始化为假
        for(int r=0; r<rows; r++){
            for(int c=0;c<clos;c++){
                if(isOK(matrix, target, r, c, mark)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isOK(char[][] matrix, String target, int row, int col, boolean[][] mask){
        if(target.equals("")) return true;
        if(row < 0 || col < 0 || row > matrix.length -1 || col > matrix[0].length) return false;
        if(!mask[row][col]){
            if(matrix[row][col] == target.charAt(0)){
                mask[row][col] = true;
                if( isOK(matrix, target.substring(1),row+1,col, mask) ||
                isOK(matrix,target.substring(1),row-1,col,mask)||
                isOK(matrix, target.substring(1), row, col+1, mask)||
                isOK(matrix, target.substring(1), row, col-1, mask)){
                    return true;
                }
                mask[row][col] = false;
            }
        }
        return false;
    }

    public static void main(String[] args){
        char[][] testMatrix = new char[][]{{'a','b', 't', 'g'},{'c', 'f', 'c', 's'},{'j','d','e','h'}};
        String target = "abfc";
        System.out.println(hasPath(testMatrix, target));
    }
}
