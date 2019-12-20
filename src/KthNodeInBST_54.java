public class KthNodeInBST_54 {
    static int count = 0;
    static class Node{
        int value;
        Node(int value){
            this.value = value;
        }
        Node left;
        Node right;
    }

    public static Node kthNodeInBST(Node root, int k){
        if(root == null || k <= 0) return null;
        return kthNodeInBSTCore(root, k);
    }

    public static Node kthNodeInBSTCore(Node root, int k){
        Node target = null;
        if(root.left != null){
            target = kthNodeInBSTCore(root.left, k);
        }
        if(target == null){
            if(++count == k) return root;
            else if(root.right != null) return kthNodeInBST(root.right, k);
        }else return target;
        return null;
    }

    public static void main(String[] args){
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(7);
        Node d = new Node(2);
        Node e = new Node(4);
        Node f = new Node(6);
        Node g = new Node(8);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        c.left = g;
        System.out.println(kthNodeInBST(a, 3).value);
    }
}
