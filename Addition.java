public class Addition extends Operation {

    public Addition() {
        
    }

    @Override
    public void calculate(double operand1, double operand2) {
        this.result = operand1 + operand2; 
    }

    @Override
    public void showResult () {
        System.out.println("Result: " + this.result);
    }
}
