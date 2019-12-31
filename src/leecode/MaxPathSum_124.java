package leecode;

public class MaxPathSum_124 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        int total = maxPathSumCore(root);
        return Math.max(max, total);
    }
    public int maxPathSumCore(TreeNode root){
        if(root.left == null && root.right == null) return root.val;
        if(root.right == null){
            int left = maxPathSumCore(root.left);
            max = Math.max(max, left);
            if(left >0) return root.val + left;
        }else if(root.left == null){
            int right = maxPathSumCore(root.right);
            max = Math.max(max,right);
            if(right > 0) return root.val + right;
        }else{
            int left = maxPathSumCore(root.left);
            int right = maxPathSumCore(root.right);
            max = Math.max(max,Math.max(right+left+root.val,Math.max(right, left)));
            if(left>=right){
                if(left > 0) return root.val+left;
            }else{
                if(right > 0) return root.val + right;
            }
        }

        return root.val;
    }
}
