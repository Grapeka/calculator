public abstract class Operation {
    protected double operand1, operand2, result; 
    boolean err;
    
    public Operation() {}

    public Operation (double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    // public boolean validateOperand(double operand1, double operand2){
    //     return err;
    // }

    public void calculate (double operand1, double operand2) {
    }

    public void showResult () {
    }

    public boolean validateOperand(double operand2) {
        return false;
    }

    
}
