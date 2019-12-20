public class InversePairs_51 {
    public static int inversePairs(int[] data){
        if(data == null || data.length < 2) return 0;
        return inversePairsCore(data, 0,data.length-1);
    }

    public static int inversePairsCore(int[] data, int start, int end){
        if(start-end+1==1) return 0;
        else{
            int mid = (start + end)/2;
            int result = inversePairsCore(data, start, mid) + inversePairsCore(data,mid+1, end);
            int[] tmp = new int[end-start+1];
            int left = start;
            int right = mid+1;
            int count = 0;
            while (left<=mid && right<= end){
                if(data[left] <= data[right]){
                    tmp[count] = data[left];
                    left ++;
                }else{
                    tmp[count] = data[right];
                    result += mid-left+1;
                    right ++;
                }
                count++;
            }
            while (left<=mid){
                tmp[count] = data[left];
                left ++;
                count ++;
            }
            while (right<= end){
                tmp[count] = data[right];
                right ++;
                count ++;
            }
            for(int i=0; i<tmp.length;i++){
                data[start] = tmp[i];
                start ++;
            }
            return result;
        }
    }

    public static void main(String[] args){
        int[] test = new int[]{7,6,5,4,3};
        System.out.println(inversePairs(test));
    }
}
