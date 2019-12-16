/**
 * User: yuwei
 * Date: 2019/12/16
 * Time: 21:18
 */
public class BinaryTreeMirror_27 {
  static class Node{
    int value;
    Node left;
    Node right;
    Node(int value){
      this.value = value;
    }
  }

  public static void binaryTreeMirror(Node head){
    if(head == null) return;
    Node tmp = head.left;
    head.left = head.right;
    head.right = tmp;
    binaryTreeMirror(head.left);
    binaryTreeMirror(head.right);
  }

  public static void main(String[] args){
    Node a = new Node(8);
    Node b = new Node(6);
    Node c = new Node(10);
    Node d = new Node(5);
    Node e = new Node(7);
    Node f = new Node(9);
    Node g = new Node(11);

    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    c.left = f;
    c.right = g;
    binaryTreeMirror(a);
    System.out.print(a.left.value);
  }


}
