package javaClasses.calculator.stateExecution;

import java.util.ArrayDeque;
import java.util.Deque;

public class BinaryOperator {
    private Deque<Character> operators = new ArrayDeque<>();

    public Deque<Character> getOperators() {
        return operators;
    }

    public void setOperators(Deque<Character> operators) {
        this.operators = operators;
    }
}
