import java.util.Queue;
import java.util.Stack;

public class FindPath_34 {
     static class Node{
         int value;
         Node left;
         Node right;
         Node(int value){
             this.value = value;
         }
     }

     public static void findPath(Node head, int target){
        if(head == null) return;
        int sum = 0;
        Stack<Node> stack = new Stack<>();
        findPathBackTrace(head, sum, target, stack);
     }

     public static void findPathBackTrace(Node head, int sum, int target, Stack<Node> stack){
         if(head == null) return;
         if(head.left == null && head.right ==null && (sum+head.value) == target){
             stack.push(head);
             stack.forEach(n-> {
                 System.out.print(n.value);
                 System.out.print('\t');
             } );
             System.out.println();
             stack.pop();
         } else{
             sum += head.value;
             stack.push(head);
             findPathBackTrace(head.left, sum, target, stack);
             findPathBackTrace(                                                                                                       head.right, sum, target, stack);
             stack.pop();
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
        findPath(a, 30);
    }
}
