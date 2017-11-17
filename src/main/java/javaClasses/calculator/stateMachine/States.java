package javaClasses.calculator.stateMachine;

/**
 * Enum of all possible states.
 * @author DiachenkoD
 */
public enum States {
    START(0),
    NUMBER(1),
    BINARY_OPERATION(2),
    OPEN_BRAKE(3),
    CLOSE_BRAKE(4),
    FUNCTION(5),
    FINISH(6);

    public int getNumber() {
        return number;
    }

    private int number;

    States(int i){
        this.number = i;
    }

}
