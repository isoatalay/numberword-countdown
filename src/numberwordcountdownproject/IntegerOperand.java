

package numberwordcountdownproject;

public class IntegerOperand extends Operand {

    private int value;
    public IntegerOperand(int value) {
        this.value = value;
        buildSolutionString(this);
    }

    @Override
    public Operand add(Operand op) {
        IntegerOperand iop = (IntegerOperand)op;
        Operand newOp = new IntegerOperand(this.value + iop.getValue());
        newOp.buildSolutionString(this, iop, " + ");
        return newOp;
    }

    @Override
    public Operand subtract(Operand op) {
        IntegerOperand iop = (IntegerOperand)op;
        Operand newOp = new IntegerOperand(this.value - iop.getValue());
        newOp.buildSolutionString(this, iop, " - ");
        return newOp;
    }

    @Override
    public Operand multiply(Operand op) {
        IntegerOperand iop = (IntegerOperand)op;
        Operand newOp = new IntegerOperand(this.value * iop.getValue());
        newOp.buildSolutionString(this, iop, " * ");
        return newOp;
    }

    @Override
    public double distance(Operand op) {
        if (op == null) {
            return Double.MAX_VALUE;
        } else {
            return Math.abs(value - ((IntegerOperand) op).value);
        }
    }

    @Override
    public String getStringValue() {
        return "" + this.value;
    }
    
    public int getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "" + this.value;
    }
}
