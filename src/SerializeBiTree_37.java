public class SerializeBiTree_37 {
    static int index = 0;

    static class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
        }
    }

    public static void serialize(Node head, StringBuilder sb){
        if(head != null){
            sb.append(head.value);
            serialize(head.left,sb);
            serialize(head.right,sb);
        }else{
            sb.append("$");
        }
    }

    public static Node Deserialize(String str){
        if(str.length() >0 && str.charAt(0) != '$'){
            Node head = new Node(str.charAt(0)-'0');
            str = DeserializeRecur(str.substring(1), head, true);
            DeserializeRecur(str, head, false);
            return head;
        }
        return null;
    }

    public static Node Deserialize2(String str){
        if(str.length() == 0) return null;
        Node root = new Node(str.charAt(0) - '0');
        index ++;
        root.left = DeserializeRecur2(str);
        root.right = DeserializeRecur2(str);
        return root;
    }

    public static Node DeserializeRecur2(String str){
        if(str.charAt(index) == '$'){
            index ++;
            return null;
        }
        Node tmp = new Node(str.charAt(index)-'0');
        index ++;
        tmp.left = DeserializeRecur2(str);
        tmp.right = DeserializeRecur2(str);
        return tmp;
    }
    public static String DeserializeRecur(String str, Node parent, boolean left){
        if(str.length() > 0){
            if(str.charAt(0) == '$'){
                if(left) parent.left = null;
                else parent.right = null;
                return str.substring(1);
            }else{
                Node tmp = new Node(str.charAt(0)-'0');
                if(left) parent.left = tmp;
                else parent.right = tmp;
                str = DeserializeRecur(str.substring(1), tmp, true);

                return DeserializeRecur(str, tmp, false);
            }
        }else{
            return "";
        }
    }

    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.left = b;
        a.right = c;
        b.left = d;
        c.left = e;
        c.right = f;
        StringBuilder sb = new StringBuilder();
        serialize(a, sb);
        Node res = Deserialize2(sb.toString());
        System.out.println(res.right.left.value);


    }
}
