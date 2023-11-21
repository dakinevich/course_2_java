import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println(calc("1 2 + 3"));

        } catch (Exception e){
            System.out.println("Incorrect input");
        }

    }
    public static Double calc(String expression) throws Exception {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split(" ");
        try{
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
        }
        catch (Exception e){
            throw e;
        }
        double result = stack.pop();
        if (stack.empty()){
            return result;
        }
        throw new Exception();
    }
}