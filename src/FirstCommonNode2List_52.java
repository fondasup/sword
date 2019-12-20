public class FirstCommonNode2List_52 {

    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public static Node firstCommonNode(Node head1, Node head2){
        if(head1 == null || head2 == null) return null;
        int len1 = 0;
        int len2 = 0;
        Node tHead1 = head1;
        Node tHead2 = head2;
        while (tHead1 != null){
            tHead1 = tHead1.next;
            len1 ++;
        }
        while (tHead2 != null){
            tHead2 = tHead2.next;
            len2 ++;
        }
        tHead1 = head1;
        tHead2 = head2;
        if(len1 > len2){
            for(int i=0; i<len1-len2;i++){
                tHead1 = tHead1.next;
            }
        }else if(len2 > len1){
            for(int i=0; i< len2-len1; i++){
                tHead2 = tHead2.next;
            }
        }
        while (tHead1 != tHead2){
            tHead1 = tHead1.next;
            tHead2 = tHead2.next;
        }

        return tHead1;
    }

}
