package javaClasses.calculator.stateMachine;


import java.security.InvalidParameterException;

import static javaClasses.calculator.stateMachine.States.*;

/**
 * Will determinate possibility of work machine and make a passes between states.
 *
 * @author DiachenkoD
 */

public class Parser extends FiniteStateMachine {
    private int currentState = 0;
    private int[][] transitionMatrix = {
            {0, 1, 0, 1, 0, 1, 0},
            {0, 0, 1, 0, 1, 0, 1},
            {0, 1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0},
            {0, 0, 1, 0, 1, 0, 1},
            {0, 0, 1, 0, 1, 0, 1},
            {0, 0, 0, 0, 0, 0, 0}};


    public void parse(String string) {
        char[] symbols = string.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            if (Character.isDigit(symbols[i])) {
                numberState();
            }
            if (Character.isLetter(symbols[i])) {
                functionState();
            }
            if (symbols[i] >= 42 && symbols[i] <= 47) {
                binaryOperationState();
            }
            if (symbols[i] == 40){
                openBrakeState();
            }
            if (symbols[i] == 41){
                closeBrakeState();
            }
        }
        finishState();
    }


    @Override
    public void start() {
    }

    @Override
    public void numberState() {
        if (transitionMatrix[currentState][NUMBER.getNumber()] == 1) {
            currentState = NUMBER.getNumber();
        } else throw new InvalidParameterException("Invalid format of input data");
    }

    @Override
    public void binaryOperationState() {
        if (transitionMatrix[currentState][BINARY_OPERATION.getNumber()] == 1) {
            currentState = BINARY_OPERATION.getNumber();
        } else throw new InvalidParameterException("Invalid format of input data");
    }

    @Override
    public void openBrakeState() {
        if (transitionMatrix[currentState][OPEN_BRAKE.getNumber()] == 1) {
            currentState = OPEN_BRAKE.getNumber();
        } else throw new InvalidParameterException("Invalid format of input data");
    }

    @Override
    public void closeBrakeState() {
        if (transitionMatrix[currentState][CLOSE_BRAKE.getNumber()] == 1) {
            currentState = CLOSE_BRAKE.getNumber();
        } else throw new InvalidParameterException("Invalid format of input data");
    }

    @Override
    public void functionState() {
        if (transitionMatrix[currentState][FUNCTION.getNumber()] == 1) {
            currentState = FUNCTION.getNumber();
        } else throw new InvalidParameterException("Invalid format of input data");
    }

    @Override
    public void finishState() {
        if (transitionMatrix[currentState][FINISH.getNumber()] == 1) {
            currentState = FINISH.getNumber();
            System.out.println("The counting is finished, wait for result, please");
        } else throw new InvalidParameterException("Invalid format of input data");
    }


}
