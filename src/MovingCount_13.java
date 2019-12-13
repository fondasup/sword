public class MovingCount_13 {
    public static int movingCount(int threshold, int rows, int cols){

        return result;
    }

    public static int movingCountCore(int threshold, int row, int col, int rows, int cols){
        if(row > rows || col > cols) return 0;
        int total = 0;
        int tRow = row;
        int tCol = col;
        while(tRow > 0){
            total += tRow%10;
            tRow /= 10;
        }
        while (tCol > 0){
            total += tCol % 10;
            tCol /= 10;
        }
        if(total > threshold) return 0;
        else return movingCountCore(threshold, row + 1, col, rows, cols) + movingCountCore(threshold, row, col+1, rows, cols);
    }
}
