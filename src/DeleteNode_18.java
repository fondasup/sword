/**
 * User: yuwei
 * Date: 2019/12/15
 * Time: 18:35
 */
public class DeleteNode_18 {
  static class Node{
    Node(int value){
      this.value = value;
    }

    int value;
    Node nextNode;
  }

  public static Node deleteNode(Node head, Node target){
    if(head == null || target == null) return null;
    if(target.nextNode != null){
      target.value = target.nextNode.value;
      target.nextNode = target.nextNode.nextNode;
    }else if(head == target){
      head = null;
    }else{
      Node curNode = head;
      while (curNode.nextNode != target){
        curNode = curNode.nextNode;
      }
      curNode.nextNode = null;
    }
    return head;
  }

  public static Node deleteDuplicate(Node head) {
    if (head == null) return null;
    Node preHead = new Node(0);
    preHead.nextNode = head;
    Node pre = preHead;
    int curValue = head.value;
    Node cur = head;
    boolean needDelete = false;
    while (cur.nextNode != null) {
      if (cur.nextNode.value != curValue) {
        if (needDelete) {
          pre.nextNode = cur.nextNode;
          needDelete = false;
        } else {
          pre = cur;
        }
        curValue = cur.nextNode.value;
        cur = cur.nextNode;
      } else {
        needDelete = true;
        cur = cur.nextNode;
      }
    }
    if(needDelete){
      pre.nextNode = null;
    }
    return preHead.nextNode;
  }


  public static void main(String[] args){
    Node n1 = new Node(2);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    n1.nextNode = n2;
    n2.nextNode = n3;
    n3.nextNode = n4;
    Node result = deleteDuplicate(n1);
    while (result != null){
      System.out.print(result.value);
      result = result.nextNode;
    }

  }



}
