public class MovingCount_13 {
    public static int movingCount(int threshold, int rows, int cols){
        boolean[][] visited = new boolean[rows][cols];
        return movingCountCore(threshold, 0, 0, rows, cols,visited);
    }

    public static int movingCountCore(int threshold, int row, int col, int rows, int cols, boolean[][] visited){
        if(row >= rows || col >= cols || visited[row][col]) return 0;
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
        else{
            visited[row][col] = true;
            return movingCountCore(threshold, row + 1, col, rows, cols, visited) + movingCountCore(threshold, row, col+1, rows, cols, visited) + 1;
        }
    }

    public static void main(String[] args){
        System.out.println(movingCount(2, 50,50));
    }
}
