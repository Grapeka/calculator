import java.util.Scanner;

public class Calculator {
    private static double operandInput1, operandInput2;
    protected Operation calculatorOperation = new Operation();
    public Calculator(){}
    
    public Calculator(double operandOne, double operandTwo, String operationInput){
        operandInput1 = operandOne;
        operandInput2 = operandTwo;
        setOperation(operationInput);
    }

    public void setOperation (String operationInput){

        if(operationInput.equals("+")){
            this.calculatorOperation = new Addition();
        } else if (operationInput.equals("-")){
            this.calculatorOperation= new Substraction();
        } else if (operationInput.equals("*")){
            this.calculatorOperation= new Multiplication();
        } else if(operationInput.equals("/")){
            this.calculatorOperation = new Division();

            if (!this.calculatorOperation.validateOperand(this.calculatorOperation, operandInput1, operandInput2)){
                this.calculatorOperation.err = "Error, The divisor is 0";
            }

        } else {  
            calculatorOperation.valid = false;
            calculatorOperation.err = "Error, Invalid operator";
        }
    }   

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Operator: ");
        String operatorInput =  scanner.next();

        System.out.print("Operand 1: ");
        operandInput1 =  scanner.nextDouble();
    
        System.out.print("Operand 2: ");
        operandInput2 =  scanner.nextDouble();
    
        scanner.close();
    
        Calculator calculator = new Calculator(operandInput1, operandInput2, operatorInput);

        if(calculator.calculatorOperation.getValid()){
            calculator.calculatorOperation.calculate(operandInput1, operandInput2);
            System.out.println(calculator.calculatorOperation.getResult());
        } else {
            System.out.println(calculator.calculatorOperation.getError());
        }
    }
}