package org.example.interpreter;

public class Client {
    public static void main(String[] args) {
        // 创建环境
        Context context = new Context();

        // 创建变量
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        // 给变量赋值
        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);

        // 构建表达式: a + b - c + d
        AbstractExpression expression = new Plus(new Minus(new Plus(a, b), c), d);

        // 解释表达式
        int result = expression.interpret(context.getMap());

        System.out.println(expression + " = " + result);
    }
}

