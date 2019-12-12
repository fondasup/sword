import java.sql.Struct;


// fixme  递归是另一种栈的形式，当然这里也可以采用栈；
public class PrintListReverse_6 {
    public static void printReversely(Node head){
        if(head == null) return;
        else{
            printReversely(head.next);
            head.print();
        }
    }

    public static void main(String[] args){
        Node l1 = new Node(1);
        Node l2 = new Node(2);
        Node l3 = new Node(3);
        l1.addNode(l2);
        l2.addNode(l3);
        printReversely(l1);
    }
}

class Node{
    int value;
    Node next = null;
    Node(int value){
        this.value = value;
    }
    public void addNode(Node next){
        this.next = next;
    }
    public void print(){
        System.out.println(value);
    }
}

