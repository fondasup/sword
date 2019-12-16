public class EntryPointInList_23 {
    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public static Node entryPointInList(Node head){
        if(head == null) return null;
        Node before = head;
        Node behind = head;
        int beforeStep = 0;
        int behindStep = 0;
        while (before.next != behind){
            if(before.next == null) return null;
            before = before.next;
            beforeStep ++;
            if(beforeStep%2 == 0){
                behindStep ++;
                behind = behind.next;
            }
        }
        int circleNodeNum = beforeStep - behindStep;
        before = head;
        behind = head;
        int step = 0;
        while(before.next != behind){
            if(step >= circleNodeNum){
                behind = behind.next;
            }
            before = before.next;
            step ++;
        }
        return behind;
    }

    public static void main(String[] args){
        Node l1 = new Node(1);
        Node l2 = new Node(2);
        Node l3 = new Node(3);
        Node l4 = new Node(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l3;
        System.out.println(entryPointInList(l1).value);
    }
}
