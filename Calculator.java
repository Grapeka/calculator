import java.util.Scanner;

public class Calculator {
    private static double operand1, operand2;
     Operation calculatorOperation = new Operation();
    public Calculator(){}
    
    public Calculator(double operandOne, double operandTwo, String operationInput){
        operand1 = operandOne;
        operand2 = operandTwo;
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

            if (!this.calculatorOperation.validateOperand(this.calculatorOperation, operand1, operand2)){
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
        Double operand1 =  scanner.nextDouble();
    
        System.out.print("Operand 2: ");
        Double operand2 =  scanner.nextDouble();
    
        scanner.close();
    
        Calculator calculator = new Calculator(operand1, operand2, operatorInput);

        if(calculator.calculatorOperation.getValid()){
            calculator.calculatorOperation.calculate(operand1, operand2);
            System.out.println(calculator.calculatorOperation.getResult());
        } else {
            System.out.println(calculator.calculatorOperation.getError());
        }
    }
}