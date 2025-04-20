
package numberwordcountdownproject;

 interface Operate {

    abstract Operand add(Operand op);

    abstract Operand subtract(Operand op);

    abstract Operand multiply(Operand op);

    abstract double distance(Operand op);

}

public abstract class Operand implements Operate{
    private String potentialSolution;
    
    
    public Operand buildSolutionString(Operand op1, Operand op2, String operatorSign) {
        this.potentialSolution = "(" + op1.potentialSolution + operatorSign + op2.potentialSolution + ")";
        return this;
    }

    public Operand buildSolutionString(Operand op) {
        this.potentialSolution = op.getStringValue();
        return this;
    }

    public String getSolution() {
        return this.potentialSolution;

    }

    public abstract String getStringValue();
    
    @Override 
    public abstract String toString();
  
}
