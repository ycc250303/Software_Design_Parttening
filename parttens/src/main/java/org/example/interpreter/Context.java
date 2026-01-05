package org.example.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境类
 */
public class Context {
    private Map<Variable, Integer> map = new HashMap<>();

    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    public int getValue(Variable var) {
        return map.get(var);
    }

    public Map<Variable, Integer> getMap() {
        return map;
    }
}

