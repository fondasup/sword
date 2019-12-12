import java.util.Stack;

/**
 * User: yuwei
 * Date: 2019/12/12
 * Time: 22:40
 */
public class Stack4Queue_9 {
  private Stack<Integer> addStack = new Stack<>();
  private Stack<Integer> deleteStack = new Stack<>();

  public void add(int value) {
    while (!deleteStack.isEmpty()) {
      addStack.push(deleteStack.pop());
    }
    addStack.push(value);
  }

  public void delete() {
    while (!addStack.isEmpty()) {
      deleteStack.push(addStack.pop());
    }
    if(!deleteStack.isEmpty()) {   // fixme  要考虑删除元素是否有 以及问清楚要怎么处理这种异常
      deleteStack.pop();
    }else{
      System.out.println("Queue is empty, no elements to delete");
    }
  }

  public void print(){
    while (! deleteStack.isEmpty()){
      addStack.push(deleteStack.pop());
    }
    System.out.println(addStack);
  }

  public static void main(String[] args){
    Stack4Queue_9 test = new Stack4Queue_9();
//    test.add(1);
//    test.add(2);
//    test.add(4);
    test.delete();
    test.add(5);
    test.print();
  }
}
