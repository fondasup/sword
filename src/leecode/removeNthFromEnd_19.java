package leecode;

public class removeNthFromEnd_19 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode forword = pre;
        ListNode follow = pre; // 利用一个pre
        for(int i=1;i<=n;i++){
            forword = forword.next;
        }
        while(forword.next != null){  //follow要到要删除节点的前一个节点；
            forword = forword.next;
            follow = follow.next;
        }
        follow.next = follow.next.next;
        return pre.next;
    }
}
