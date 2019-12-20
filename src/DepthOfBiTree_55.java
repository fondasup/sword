public class DepthOfBiTree_55 {
    static boolean isBalancedTree = true;
    static class Node{
        int value;
        Node(int value){
            this.value = value;
        }
        Node left;
        Node right;
    }
    public static int DepthOfBT(Node root){
        if(root == null) return 0;
        return DepthOfBTCore(root, 0);
    }

    public static int DepthOfBTCore(Node root, int depth){
        if(root == null) return depth;
        int leftDepth = DepthOfBTCore(root.left, depth + 1);
        int rightDepth = DepthOfBTCore(root.right, depth+1);
        return Math.max(leftDepth, rightDepth);
    }

    public static boolean balanceTree(Node root){
        if(root == null) return true;
        balanceTreeCore(root, 0);
        return isBalancedTree;
    }
    public static int balanceTreeCore(Node root, int depth){
        if(root == null) return depth;
        int leftDepth = 0;
        int rightDepth = 0;
        if(isBalancedTree) {
            leftDepth = DepthOfBTCore(root.left, depth + 1);
        }
        if(isBalancedTree){
            rightDepth = DepthOfBTCore(root.right, depth + 1);
        }
        if(Math.abs(leftDepth-rightDepth) > 1) isBalancedTree = false;
        return Math.max(leftDepth, rightDepth);
    }

    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b;
        a.right = c;
        b.right = e;
        e.left = g;
        c.right = f;
        g.left = d;
        balanceTree(a);
        System.out.println(isBalancedTree);
    }
}
