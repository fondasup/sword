/**
 * User: yuwei
 * Date: 2019/12/16
 * Time: 22:16
 */
public class PrintMatrixWisely_29 {
  public static void printMatrixWisely(int[][] matrix){
    if(matrix.length == 0) return;
    int rows = matrix.length;
    int cols = matrix[0].length;
    int top = 0;
    int bottom = rows-1;
    int left = 0;
    int right = cols-1;
    while (bottom >= top && right>=left){
      for (int i=left;i<=right;i++){
        System.out.print(matrix[top][i]);
        System.out.print('\t');
      }
      top++;
      for(int i=top;i<=bottom;i++){
        System.out.print(matrix[i][right]);
        System.out.print('\t');
      }
      right --;
      if(bottom >= top) {
        for (int i = right; i >= left; i--) {
          System.out.print(matrix[bottom][i]);
          System.out.print('\t');
        }
        bottom--;
      }
      if(right >= left) {
        for (int i = bottom; i >= top; i--) {
          System.out.print(matrix[i][left]);
          System.out.print('\t');
        }
      }
      left ++;
    }
  }
  public static void main(String[] args){
    int[][] test = new int[][]{
      {1},
      {5},
      {9}
    };
    printMatrixWisely(test);
  }
}
