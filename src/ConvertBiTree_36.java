import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class ConvertBiTree_36 {

    static class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
        }
    }

    public static Node convert(Node root){
        Node last = convertReccur(root);
        while (last.left != null){
            last = last.left;
        }
        return last;
    }

    public static Node convertReccur(Node parent){
        Node last = parent;
        if(parent.left != null){
            Node left = convertReccur(parent.left);
            left.right = parent;
            parent.left = left;
        }
        if(parent.right != null){
            Node right = convertReccur(parent.right);
            Node tmp = right;
            while (tmp.left != null){
                tmp = tmp.left;
            }
            parent.right = tmp;
            tmp.left = parent;
            last = right;
        }
        return last;
    }
    public static void main(String[] args){
        Node a = new Node(10);
        Node b = new Node(6);
        Node c = new Node(14);
        Node d = new Node(4);
        Node e = new Node(8);
        Node f = new Node(12);
        Node g = new Node(16);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        Node res = convert(a);
        while (res != null){
            System.out.println(res.value);
            res = res.right;
        }
    }
}
