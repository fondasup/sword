public class ReverseList_24 {
    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public static Node reverseList(Node head){
        if(head == null || head.next == null) return head;
        Node next = head;
        Node cur = head;
        Node tail = null;
        while(next != null){
            cur = next;
            next = next.next;
            cur.next = tail;
            tail = cur;
        }
        return tail;
    }

    public static void main(String[] args){
        Node l1 = new Node(1);
        Node l2 = new Node(2);
        Node l3 = new Node(3);
        Node l4 = new Node(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        Node res = reverseList(l1);
        while (res != null){
            System.out.println(res.value);
            res = res.next;
        }
    }
}
