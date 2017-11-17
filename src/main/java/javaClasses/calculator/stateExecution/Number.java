package javaClasses.calculator.stateExecution;

import java.util.ArrayDeque;
import java.util.Deque;

public class Number {
    private Deque<Double> operands = new ArrayDeque<>();

    public Deque<Double> getOperands() {
        return operands;
    }

    public void setOperands(Deque<Double> operands) {
        this.operands = operands;
    }
}
