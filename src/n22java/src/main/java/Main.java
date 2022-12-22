package n22java.src.main.java;

public class Main {
    public static void main(String[] args) {
        System.out.println(RPN_Calculator.ExpressionToRPN("5+7*3"));
        System.out.println(RPN_Calculator.RPNtoAnswer(RPN_Calculator.ExpressionToRPN("5+7*3")));
    }
}
