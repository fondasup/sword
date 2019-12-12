/**
 * User: yuwei
 * Date: 2019/12/12
 * Time: 21:06
 */
public class RebuildTree_7 {
  public static TreeNode rebuild(int[] preOrder,int preLeft, int preRight, int[] inOrder, int inLeft, int inRight){
    if(preLeft > preRight || inLeft > inRight){
      return  null;
    }
    TreeNode node = new TreeNode(preOrder[preLeft]);
    for(int i=inLeft;i<=inRight;i++){
      if(inOrder[i] == preOrder[preLeft]){
        node.setLeft(rebuild(preOrder,preLeft+1,preLeft+i-inLeft,inOrder,inLeft,i-1));
        node.setRight(rebuild(preOrder,preLeft + i-inLeft+1,preRight, inOrder, i+1, inRight));
        break;
      }
    }
    return node;
  }

  public static void main(String[] args){
    int[] pre = new int[]{1};
    int[] in = new int[]{1};
    TreeNode root = rebuild(pre, 0, pre.length-1, in, 0, in.length -1);
    root.print();

  }
}

class TreeNode{
  private int value;
  TreeNode left;
  TreeNode right;
  TreeNode(int value){
    this.value = value;
  }

  public void setLeft(TreeNode node){
    left = node;
  }
  public void setRight(TreeNode node){
    right = node;
  }
  public void print(){
    System.out.println(value);
  }
}

