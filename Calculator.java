import java.util.Scanner;

public class Calculator {
    private double operand1, operand2;
    private Operation operation = new Addition();;

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Operator : ");
        String operatorInput =  scanner.next();

        System.out.print("Operand 1: ");
        Double operand1 =  scanner.nextDouble();
    
        System.out.print("Operand 2: ");
        Double operand2 =  scanner.nextDouble();
    
        scanner.close();
    
        Calculator calculator = new Calculator(operand1, operand2, operatorInput);
     
        if(calculator.operation.getValid()){
            calculator.operation.calculate(calculator.operand1, calculator.operand2);
            System.out.println(calculator.operation.getResult());
        } else {
            System.out.println(calculator.operation.getError());
        }
        
        
    }

    public Calculator(){}

    public Calculator(double operand1, double operand2, String operation){
        this.operand1 = operand1;
        this.operand2 = operand2;

        switch(operation) {
            
            case "+" :
            this.operation = new Addition();
            break;

            case "-":
            this.operation = new Substraction();
            break;

            case "*":
            this.operation = new Multiplication();
            break;

            case "/":
            this.operation = new Division();
            if (!this.operation.validateOperand(this.operation,operand2,operand2)){
                this.operation.err = "Error, The divisor is 0";
            }
            break;

            default: 
            this.operation.valid = false;
            this.operation.err = "Error, Invalid operator";
        }

    }
}