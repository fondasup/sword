public class FindKthtoTail {
    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public static Node findKthToTail(Node head, int k){
        if(head == null || k == 0) return null;
        Node end = head;
        Node start = null;
        int step = 0;
        while(end.next != null){
            if(step == k-1){
                start = head;
            }
            step ++;
            end = end.next;
            if(step >= k)
                start = start.next;
        }
        return start;
    }

    public static void main(String[] args){
        Node l1 = new Node(1);
        Node l2 = new Node(2);
        Node l3 = new Node(3);
        Node l4 = new Node(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        System.out.println(findKthToTail(l1,1).value);
    }
}
