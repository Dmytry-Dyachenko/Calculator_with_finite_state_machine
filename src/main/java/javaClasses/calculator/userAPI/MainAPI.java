package javaClasses.calculator.userAPI;

import javaClasses.calculator.stateMachine.Parser;

public class MainAPI implements InterfaceAPI {

    @Override
    public double execute(String string) {
        Parser parser = new Parser();
        parser.parse(string);
        return 0;
    }

}
