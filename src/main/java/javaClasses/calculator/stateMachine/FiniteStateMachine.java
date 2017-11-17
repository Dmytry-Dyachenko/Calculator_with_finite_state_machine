package javaClasses.calculator.stateMachine;

/**
 * Abstract finite stateMachine machine.
 * @author DiachenkoD
 */
public abstract class FiniteStateMachine {

    public abstract void start();
    public abstract void numberState();
    public abstract void binaryOperationState();
    public abstract void openBrakeState();
    public abstract void closeBrakeState();
    public abstract void functionState();
    public abstract void finishState();


}
