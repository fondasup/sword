public class IsSubTree_26 {
    static class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
        }
    }

    public static boolean isSubTree(Node parent, Node child){
        if(child == null) return true;
        if(parent == null) return false;
        boolean result = false;
        result = isSubTreeRec(parent, child);
        if(!result) result = isSubTree(parent.left, child);
        if(!result) result = isSubTree(parent.right,child);
        return result;
    }

    public static boolean isSubTreeRec(Node parent, Node child){
        if(child == null) return true;
        if(parent.value == child.value){
            return isSubTreeRec(parent.left, child.left) && isSubTreeRec(parent.right, child.right);
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Node a = new Node(8);
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(9);
        Node e = new Node(2);
        Node f = new Node(4);
        Node g = new Node(7);
        Node h = new Node(2);
        Node i = new Node(4);
        Node j = new Node(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = f;
        e.right = g;
        h.left = i;
        h.right = j;
        System.out.println(isSubTree(a, h));
    }

}
