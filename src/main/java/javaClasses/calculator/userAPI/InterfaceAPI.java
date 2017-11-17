package javaClasses.calculator.userAPI;

/**
 * Main api interface for calculator.
 * @author DiachenkoD
 */
public interface InterfaceAPI {
    /**
     * @param string with mathematics example expressions.
     * @return The result of calculation.
     */
    double execute(String string);
}
