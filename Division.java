public class Division extends Operation{
    
    public Division() {
    }

    @Override
    public void calculate(double operand1, double operation1) {
        this.result = operand1 / operand2; 
    }

    @Override
    public boolean validateOperand(Operation operation,double operand1, double operand2){
        if (operation instanceof Division){
            if(operand2 == 0){
                valid  = false;
            }
        }
        return valid;
    }
}
