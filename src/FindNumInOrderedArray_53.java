public class FindNumInOrderedArray_53 {
    public static int find(int[] data, int k){
        int first = findFirst(data, k);
        System.out.println(first);
        int end = findLast(data, k);
        return end-first+1;
    }
    public static int findFirst(int[] data, int k){
        int left = 0;
        int right = data.length - 1;
        int mid = (left + right)/2;
        while (right >= left){
            mid = (left + right)/2;
            if(data[mid] == k){
                if(mid>0 && data[mid-1] == k){
                    right = mid-1;
                }else{
                    break;
                }
            }else if(data[mid] > k){
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }
        return mid;
    }

    public static int findLast(int[] data,int k){
        int left = 0;
        int right = data.length -1;
        int mid = 0;
        while (right >= left){
            mid = (left + right)/2;
            if(data[mid] == k){
                if(mid < data.length-1 && data[mid+1] == k){
                    left = mid +1;
                }else{
                    break;
                }
            }else if(data[mid] < k){
                left = mid +1;
            }else{
                right = mid -1;
            }
        }
        return mid;
    }

    public static int findNumEqualIndex(int[] data){
        int left = 0;
        int right = data.length-1;
        int mid = 0;
        while (right >= left){
            mid = (left + right)/2;
            if(data[mid] == mid) return mid;
            if(data[mid] < mid){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return -1;
    }

    public static int findMiss(int[] data){
        int left = 0;
        int right = data.length -1;
        int mid = (left + right)/2;
        while(right >= left){
            mid = (left + right)/2;
            if(data[mid] != mid){
                right = mid-1;
            }else if(mid<data.length-1 && data[mid+1] == mid+1){
                left = mid + 1;
            }else{
                break;
            }
        }
        if(right<0) return 0;
        return mid+1;
    }

    public static void main(String[] args){
        int[] test = new int[]{-3,-1,1,3,5};
        System.out.println(findNumEqualIndex(test));
    }

}
