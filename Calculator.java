import java.util.Scanner;

public class Calculator {
    private double operand1, operand2;
    public Operation operation;

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

        System.out.println(calculator.operand1);
        System.out.println(calculator.operand2);
        
        if(calculator.operation instanceof Division){
            if(calculator.operation.validateOperand(calculator.operand2) == true){
                System.out.println("Error, The division is 0");

            }else {
                calculator.operation.calculate(calculator.operand1, calculator.operand2);
                calculator.operation.showResult();
            }

        }else {
            calculator.operation.calculate(calculator.operand1, calculator.operand2);
            calculator.operation.showResult();
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
            break;
        }

    }
}