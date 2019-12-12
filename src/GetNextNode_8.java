/**
 * User: yuwei
 * Date: 2019/12/12
 * Time: 22:17
 */
public class GetNextNode_8 {
  static class Node{
    int value;
    Node parent;
    Node left;
    Node right;
    Node(int value){
      this.value = value;
    }
  }

  public static Node getNext(Node node){
    if(node == null) return null;
    Node curNode = node.right;
    if(curNode != null){
      while (curNode.left != null){
        curNode = curNode.left;
      }
      return curNode;
    }else{
      curNode = node;
      while (curNode.parent != null){
        if(curNode.parent.left == curNode){
          return curNode.parent;
        }else{
          curNode = curNode.parent;
        }
      }
    }
    return null;
  }

  public static void main(String[] args){
    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);
    Node e = new Node(5);
    Node f = new Node(6);
    Node g = new Node(7);
    Node h = new Node(8);
    Node i = new Node(9);
    a.parent = null;
    a.left = b;
    a.right = c;
    b.parent = a;
    c.parent = a;
    b.left = d;
    b.right = e;
    d.parent = b;
    e.parent = b;
    e.left = h;
    e.right = i;
    h.parent = e;
    i.parent = e;
    c.left = f;
    c.right = g;
    f.parent = c;
    g.parent = c;
    System.out.println(getNext(b).value);

  }


}


