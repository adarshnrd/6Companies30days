package Microsoft;
import java.util.Stack;
public class ReversePolishNotation {
        public static void main(String[] args) {
            String tokens[]={"2","1","+","3","*"};
            System.out.println(evalRPN(tokens));
        }
        public static int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();
            for (String token : tokens) {
                switch (token) {
                    case "+":
                        stack.push(stack.pop() + stack.pop());
                        //if "+" came it will pop 2 element and add and push back the element to stack
                        break;
                    case "-":
                        stack.push(-stack.pop() + stack.pop());
                        break;
                    case "*":
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case "/":
                        int divisor = stack.pop();
                        stack.push(stack.pop() / divisor);
                        break;
                    default:
                        stack.push(Integer.parseInt(token));
                        //if no symbol came it will just add to stack and apply the operation when symbol come.
                }
            }
            return stack.pop();
        }
    }