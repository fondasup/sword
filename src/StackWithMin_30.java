import java.util.Stack;
public class StackWithMin_30 {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> stackMin = new Stack<>();

    public int pop(){
        if(stack.empty()){
            System.out.println("stack is empty");
            return 0;
        }else{
            stackMin.pop();
            return stack.pop();
        }
    }

    public void push(int value){
        stack.push(value);
        if(stackMin.empty() || stackMin.peek() > value){
            stackMin.push(value);
        }else{
            stackMin.push(stackMin.peek());
        }
    }

    public int getMin(){
        if(stackMin.empty()){
            System.out.println("stack is empty");
            return -1;
        }else{
            return stackMin.peek();
        }
    }

    public static void main(String[] args){
        StackWithMin_30 test = new StackWithMin_30();
        test.push(2);
        test.push(4);
        test.push(1);
        test.push(6);
//        test.pop();
        System.out.println(test.getMin());
    }

}
