public class MergeTwoList_25 {
    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public static Node merge(Node head1, Node head2){
        Node preHead = new Node(0);
        preHead.next = null;
        Node cur = preHead;
        while(head1 != null || head2 != null){
            if(head1 == null){
                cur.next = head2;
                head2 = null;
            }else if(head2 == null){
                cur.next = head1;
                head1 = null;
            }else{
                System.out.println("====");
                if(head1.value < head2.value){
                    cur.next = head1;
                    head1 = head1.next;
                }else{
                    cur.next = head2;
                    head2 = head2.next;
                }
                cur = cur.next;
            }
        }
        return preHead.next;
    }
    public static void main(String[] args){
        Node l1 = new Node(1);
        Node l2 = new Node(2);
        Node l3 = new Node(3);
        Node l4 = new Node(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        Node l5 = new Node(4);
        Node l6 = new Node(6);
        Node l7 = new Node(7);
        Node l8 = new Node(8);
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        Node res = merge(l1, l2); //输入属于同一个链表的两段会导致死循环
        while (res != null){
            System.out.println(res.value);
            res = res.next;
        }
    }


}
