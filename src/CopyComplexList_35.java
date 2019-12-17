public class CopyComplexList_35 {
    static class Node{
        int value;
        Node next;
        Node sib;
        Node(int value){
            this.value = value;
        }
    }

    public static Node copyComplexList(Node head){
        Node cur = head;
        while (cur != null){
            Node n = new Node(cur.value);
            Node next = cur.next;
            cur.next = n;
            n.next = next;
            cur = next;
        }
        cur = head;
        while (cur != null){
            if(cur.sib != null){
                cur.next.sib = cur.sib.next;
            }
            cur = cur.next.next;
        }
        cur = head.next;

        //这里要注意是否要恢复原始链表
        while (cur.next != null){
            cur.next = cur.next.next;
            cur = cur.next;
        }
        return head.next;
    }

    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        a.sib = c;
        b.next = c;
        b.sib = e;
        c.next = d;
        c.sib = b;
        d.next = e;

        Node res = copyComplexList(a);
        System.out.println(res.sib.value);
        System.out.println(res.next.sib.value);
    }
}
