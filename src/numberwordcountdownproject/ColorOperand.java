package numberwordcountdownproject;

public class ColorOperand extends Operand {

    public enum Color {
        RED, BLUE, MAGENTA, YELLOW, WHITE, GREEN, CYAN
    }

    final Color value;

    public ColorOperand(Color color) {
        this.value = color;
        this.buildSolutionString(this);

    }

    @Override
    public Operand add(Operand op) {
        ColorOperand colorOp = (ColorOperand) op;
        Color resultColor = Color.values()[(this.value.ordinal() + colorOp.value.ordinal()) % Color.values().length];
        ColorOperand newOp = new ColorOperand(resultColor);
        newOp.buildSolutionString(this, op, " + ");
        return newOp;
    }

    @Override
    public Operand subtract(Operand op) {
        ColorOperand colorOp = (ColorOperand) op;
        int resultOrdinal = (this.value.ordinal() - colorOp.value.ordinal() + Color.values().length) % Color.values().length;
        Color resultColor = Color.values()[resultOrdinal];
        ColorOperand newOp = new ColorOperand(resultColor);
        newOp.buildSolutionString(this, op, " - ");
        return newOp;
    }

    @Override
    public Operand multiply(Operand op) {
        ColorOperand colorOp = (ColorOperand) op;
        Color resultColor = Color.values()[(this.value.ordinal() * colorOp.value.ordinal()) % Color.values().length];
        ColorOperand newOp = new ColorOperand(resultColor);
        newOp.buildSolutionString(this, op, " * ");
        return newOp;
    }

    @Override
    public double distance(Operand op) {
        if (op == null) {
            return Double.MAX_VALUE;
        } else {
            ColorOperand colorOp = (ColorOperand) op;
            int diff = Math.abs(this.value.ordinal() - colorOp.value.ordinal());
            return (double) diff / Color.values().length;

        }
    }

    @Override
    public String getStringValue() {
        return "" + this.value;
    }

    @Override
    public String toString() {
         return "" + this.value;
    }

}
