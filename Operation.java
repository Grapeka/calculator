public class Operation {
    protected double operand1,operand2;
	protected double result; 
    protected  boolean valid = true;
    String err;
    
    public Operation() {}

    public Operation (double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;    
    }

    public void calculate (double operand1, double operand2) {
    }

    public double getResult() {
        return result;
    }

    public boolean validateOperand(Operation operation, double operand1 ,double operand2){
        return valid;
    }

    public boolean getValid() {
        return valid;
    }

    public String getError() {
        return err;
    }


    
}
