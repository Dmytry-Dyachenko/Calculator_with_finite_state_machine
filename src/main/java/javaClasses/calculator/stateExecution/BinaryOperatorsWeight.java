package javaClasses.calculator.stateExecution;

public enum BinaryOperatorsWeight {
    ADD(1),
    SUBTRACT(1),
    MULTIPLE(0),
    DIVIDE(0);

    private int weight;

    BinaryOperatorsWeight(int weight){
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

}
