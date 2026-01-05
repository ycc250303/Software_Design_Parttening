package org.example.interpreter;

import java.util.Map;

/**
 * 变量解析器
 */
public class Variable extends AbstractExpression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<Variable, Integer> context) {
        return context.get(this);
    }

    @Override
    public String toString() {
        return name;
    }
}

