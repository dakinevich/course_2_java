import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(calc("2 3 + 3 *"));
    }
    public static Double calc(String expression){
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                default:
                    stack.push(Double.parseDouble(token));
                    break;
            }
        }

        return stack.pop();
    }
}