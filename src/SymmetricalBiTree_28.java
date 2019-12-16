/**
 * User: yuwei
 * Date: 2019/12/16
 * Time: 21:28
 */
public class SymmetricalBiTree_28 {
  static class Node{
    int value;
    Node left;
    Node right;
    Node(int value){
      this.value = value;
    }
  }

  public static boolean symmetricReccur(Node n1, Node n2){
    if(n1 == null && n2 == null) return true;
    if(n1 != null && n2 != null && n1.value == n2.value) return symmetricReccur(n1.left, n2.right) && symmetricReccur(n1.right, n2.left);
    return false;
  }

  public static boolean isSymmetric(Node head){
    if(head == null) return true;
    return symmetricReccur(head.left,head.right);
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
    System.out.print(isSymmetric(a));
  }

}
