import java.util.Stack;

public class IsPopOrder_31 {

    public static boolean isPopOrder(int[] pushOrder, int[] popOrder){
        if(pushOrder.length != popOrder.length) return false;
        Stack<Integer> stack = new Stack<>();
        int pushCount = 0;
        for(int i=0; i<popOrder.length;i++){
            if(stack.empty() || stack.peek() != popOrder[i]){
                int j=pushCount;
                for(; j<pushOrder.length; j++){
                    if(pushOrder[j] == popOrder[i]){
                        pushCount ++;
                        break;
                    }else{
                        stack.push(pushOrder[j]);
                        pushCount ++;
                    }
                }
                if(j == popOrder.length) return false;
            }else{
                stack.pop();
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] pushOrder = new int[]{1,2,3,4,5};
        int[] popOrder = new int[]{4,3,5,2,1};
        System.out.println(isPopOrder(pushOrder, popOrder));
    }


}
