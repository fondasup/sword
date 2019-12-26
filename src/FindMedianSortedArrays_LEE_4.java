public class FindMedianSortedArrays_LEE_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            int[] tmp = nums1;
            nums1 = nums2;
            nums2 = tmp;
        }
        int len1 = nums1.length;
        int len2 = nums2.length;
        if(len1 == 0){
            if(len2 % 2 == 0){
                return (nums2[len2/2] + nums2[len2/2-1])/2.0;
            }else{
                return nums2[len2/2];
            }
        }
        int left = 0;
        int right = len1;
        int i = 0;
        int j = 0;
        int half = (len1 + len2 +1)/2;
        int maxLeft = 0;
        int minRight = 0;
        while(right >= left){
            i = (left + right) /2;
            j = half -i;
            if(i < right && nums1[i] < nums2[j-1]){
                left = i+1;
            }else if(i>left && nums1[i-1] > nums2[j]){  // 先找到分界点
                right = i-1;
            }else{    //注意这里的临界值判断
                if(i == 0){
                    maxLeft = nums2[j-1];
                    minRight = j==len2? nums1[i]:Math.min(nums1[i], nums2[j]);
                }else if(j == 0){
                    maxLeft = nums1[i-1];
                    minRight = i==len1? nums2[j] : Math.min(nums1[i], nums2[j]);
                }else if(i == len1){
                    maxLeft = j==0? nums1[i-1] : Math.max(nums1[i-1], nums2[j-1]);
                    minRight = nums2[j];
                }else if(j == len2){
                    maxLeft = i==0? nums2[j-1] : Math.max(nums1[i-1], nums2[j-1]);
                    minRight = nums1[i];
                }else{
                    maxLeft = Math.max(nums1[i-1], nums2[j-1]);
                    minRight = Math.min(nums1[i], nums2[j]);
                }
                if((len1+len2) % 2== 0){
                    return (maxLeft+minRight)/2.0;
                }else{
                    return maxLeft;
                }
            }

        }
        return 0;

    }
}
