import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    //Add
    @Test
    public void testAddOperationByPositive() {
        Calculator calculator = new Calculator(5,8,"+");
        calculator.calculatorOperation.calculate(5, 8);
        assertEquals(13, calculator.calculatorOperation.getResult(),1);
    }

    @Test
    public void testAddOperationByNegative() {
        Calculator calculator = new Calculator(5,-2,"+");
        calculator.calculatorOperation.calculate(5, -2);
        assertEquals(3, calculator.calculatorOperation.getResult(),1);
    }

    @Test
    public void testAddOperationBetweenFloat() {
        Calculator calculator = new Calculator(0.7, 0.2,"+");
        calculator.calculatorOperation.calculate(0.7, 0.2);
        assertEquals(0.9, calculator.calculatorOperation.getResult(),1);
    }

    //Substract
    @Test
    public void testSubstractionOperation() {
        Calculator calculator = new Calculator(8,5,"-");
        calculator.calculatorOperation.calculate(8, 5);
        assertEquals(3, calculator.calculatorOperation.getResult(),1);
    }

    @Test
    public void testSubstractOperationByNegative() {
        Calculator calculator = new Calculator(5,-2,"-");
        calculator.calculatorOperation.calculate(5, -2);
        assertEquals(7, calculator.calculatorOperation.getResult(),1);
    }

    @Test
    public void testSubstractOperationBetweenFloat() {
        Calculator calculator = new Calculator(5.2, 4.2,"-");
        calculator.calculatorOperation.calculate(5.2, 4.2);
        assertEquals(1, calculator.calculatorOperation.getResult(),1);
    }

    //Multiply
    @Test
    public void testMultiplyOperationBetweenPositive() {
        Calculator calculator = new Calculator(5,8,"*");
        calculator.calculatorOperation.calculate(5, 8);
        assertEquals(40, calculator.calculatorOperation.getResult(),1);
    }

    @Test
    public void testMultiplyOperationBetweenNegative() {
        Calculator calculator = new Calculator(-5,-8,"*");
        calculator.calculatorOperation.calculate(5, 8);
        assertEquals(40, calculator.calculatorOperation.getResult(),1);
    }

    @Test
    public void testMultiplyOperationByNegative() {
        Calculator calculator = new Calculator(8, -2,"*");
        calculator.calculatorOperation.calculate(8, -2);
        assertEquals(-16, calculator.calculatorOperation.getResult(),1);
    }

    @Test
    public void testMultiplyOperationByFloat() {
        Calculator calculator = new Calculator(10, 2.5,"*");
        calculator.calculatorOperation.calculate(10, 2.5);
        assertEquals(25, calculator.calculatorOperation.getResult(),1);
    }

    //Division
    @Test
    public void testDivisionOperationBetweenPositive() {
        Calculator calculator = new Calculator(12,6,"/");
        calculator.calculatorOperation.calculate(12, 6);
        assertEquals(2, calculator.calculatorOperation.getResult(),1);
    }

    @Test
    public void testDivisionOperationBetweenNegative() {
        Calculator calculator = new Calculator(-18,-9,"/");
        calculator.calculatorOperation.calculate(-18, 9);
        assertEquals(-2, calculator.calculatorOperation.getResult(),1);
    }

    @Test
    public void testDivisionOperationByNegative() {
        Calculator calculator = new Calculator(8, -2,"/");
        calculator.calculatorOperation.calculate(8, -2);
        assertEquals(-4, calculator.calculatorOperation.getResult(),1);
    }

    @Test
    public void testDivisionOperationByFloat() {
        Calculator calculator = new Calculator(10, 2.5,"/");
        calculator.calculatorOperation.calculate(10, 2.5);
        assertEquals(4, calculator.calculatorOperation.getResult(),1);
    }

    @Test
    public void testDivisionByZero() {
        Calculator calculator = new Calculator(8,0,"/");
        assertEquals("Error, The divisor is 0", calculator.calculatorOperation.getError());
    }

    @Test
    public void testInvalidOperation() {
        Calculator calculator = new Calculator(2,2,"x");
        assertEquals("Error, Invalid operator", calculator.calculatorOperation.getError());
    }
}