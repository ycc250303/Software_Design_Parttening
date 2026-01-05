package org.example.interpreter;

import java.util.Map;

/**
 * 抽象表达式
 */
public abstract class AbstractExpression {
    public abstract int interpret(Map<Variable, Integer> context);
}

