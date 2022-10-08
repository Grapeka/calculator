public class Division extends Operation{
    public Division() {
        
    }

    @Override
    public void calculate(double operand1, double operand2) {
        this.result = operand1 / operand2; 
    }

    @Override
    public void showResult () {
        System.out.println("Result: " + this.result);
    }

    @Override
    public boolean validateOperand(double operand2){
        if(operand2 == 0){
            return err = true;
        }
        return false;
    }
}
