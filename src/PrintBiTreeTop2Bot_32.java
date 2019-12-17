import java.util.LinkedList;
import java.util.Queue;

public class PrintBiTreeTop2Bot_32 {

    static class Node{
        int value;
        Node(int value){
            this.value = value;
        }
        Node left;
        Node right;
    }

    public static  void printBiTreeTop2Bottom(Node head){
        if(head == null) return;
        Queue<Node> queue= new LinkedList<>();
        queue.add(head);
        Node tmp;
        while (!queue.isEmpty()){
            tmp = queue.remove();
            System.out.print(tmp.value);
            System.out.print('\t');
            if(tmp.left != null) queue.add(tmp.left);
            if(tmp.right != null) queue.add(tmp.right);
        }
    }
    public static  void printBiTreeTop2Bottom2(Node head){
        if(head == null) return;
        Queue<Node> queue= new LinkedList<>();
        queue.add(head);
        Node tmp;
        int NodeNum = 1;
        int nextNum = 0;
        int printNum = 0;
        while (!queue.isEmpty()){
            if(printNum < NodeNum) {
                tmp = queue.remove();
                System.out.print(tmp.value);
                System.out.print('\t');
                if (tmp.left != null){
                    queue.add(tmp.left);
                    nextNum ++;
                }
                if (tmp.right != null){
                    queue.add(tmp.right);
                    nextNum ++;
                }
                printNum ++;
            }else{
                System.out.println();
                NodeNum = nextNum;
                nextNum = 0;
                printNum = 0;
            }
        }
    }

    public static void main(String[] args){
        Node a = new Node(8);
        Node b = new Node(6);
        Node c = new Node(9);
        Node d = new Node(5);
        Node e = new Node(7);
        Node f = new Node(7);
        Node g = new Node(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        printBiTreeTop2Bottom2(a);
    }


}
