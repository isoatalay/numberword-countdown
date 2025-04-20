package numberwordcountdownproject;

public class StringOperand extends Operand {

    String value;

    public StringOperand(String value) {
        this.value = value;
        this.buildSolutionString(this);
    }

    @Override
    public Operand add(Operand op) {
        StringOperand sop = (StringOperand) op;
        StringOperand newOp = new StringOperand(this.value + sop.value);
        newOp.buildSolutionString(this, sop, " + ");
        return newOp;

    }

    @Override
    public Operand subtract(Operand op) {
        StringOperand sop = (StringOperand) op;

        if (this.value.contains(sop.value)) {
            int targetIndex = this.value.lastIndexOf(sop.value);
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < this.value.length(); i++) {
                if (i != targetIndex) {
                    sb.append(this.value.charAt(i));
                }
            }

            StringOperand newOp = new StringOperand(sb.toString());
            newOp.buildSolutionString(this, sop, " - ");
            return newOp;

        } else {
            return this;
        }

    }

    @Override
    public Operand multiply(Operand op) {
        StringOperand sop = (StringOperand) op;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < value.length(); i++) {
            sb.append(value.charAt(i));
            sb.append(sop.value);
        }

        StringOperand newOp = new StringOperand(sb.toString());
        newOp.buildSolutionString(this, sop, " * ");
        return newOp;

    }

    @Override
    public double distance(Operand op) {
        double distance = 0;
        if (op == null) {
            return Double.MAX_VALUE;
        } else {
            StringOperand sop = (StringOperand) op;
            int biggerLength = Math.max(sop.value.length(), value.length());

            for (int i = 0; i < biggerLength; i++) {
                char currentCh = (i < value.length() ? value.charAt(i) : ' ');
                char otherCh = (i < sop.value.length() ? sop.value.charAt(i) : ' ');

                distance += Math.abs(currentCh - otherCh);

            }
        }
        return distance;
    }

    @Override
    public String getStringValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.value;
    }

}
