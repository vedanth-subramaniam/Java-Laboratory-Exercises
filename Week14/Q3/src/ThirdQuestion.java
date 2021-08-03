import java.util.Scanner;
import java.util.Stack;

public class ThirdQuestion {

    public static Double evaluate(double a, double b, char operator){
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return b - a;
            case '*':
                return a * b;
            case '/':
                if (a == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return b / a;
        }
        return 0.0;
    }
    public static Double convert(String expression) {

        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if(c==' ')
                continue;
            if (c == '*' || c == '/' || c == '^' || c == '+' || c == '-') {
                double s1 = stack.pop();
                double s2 = stack.pop();
                double temp = evaluate(s1, s2, c);
                stack.push(temp);
            } else {
                double num = 0;
                while(Character.isDigit(c)) {
                    num = num*10 + (c-'0');
                    i++;
                    c = expression.charAt(i);
                }
                i--;
                stack.push(num);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter expression:");
        String exp = scanner.nextLine();
        System.out.println("Result: " + convert(exp));
    }
}
