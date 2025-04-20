package numberwordcountdownproject;

public class NumberWordCountdownProject {

    public static void main(String[] args) {
        Operand[] x = {new IntegerOperand(3), new IntegerOperand(5), new IntegerOperand(7)};
        ValueFinder sol = new ValueFinder(x, new IntegerOperand(1));
        System.out.println(sol);

        Operand op1 = new IntegerOperand(7);
        Operand op2 = new IntegerOperand(6);
        Operand op3 = new IntegerOperand(3);
        Operand op4 = new IntegerOperand(7);
        Operand op5 = new IntegerOperand(4);
        Operand op6 = new IntegerOperand(10);

        Operand[] opI = {op1, op2, op3, op4, op5, op6};

        ValueFinder solution = new ValueFinder(opI, new IntegerOperand(-232));//expected result can be found
        System.out.println(solution);

        ValueFinder solution2 = new ValueFinder(opI, new IntegerOperand(-940));//expected result can't be found but closest
        System.out.println(solution2);

        ValueFinder solution3 = new ValueFinder(opI, new IntegerOperand(25));//expected result is one of the numbers
        System.out.println(solution3);

        try {
            ValueFinder solution4 = new ValueFinder(null, new IntegerOperand(25));//exception
            System.out.println(solution4);
        } catch (Exception e) {
            System.out.println(e + "\n");
        }

      Operand op1a = new StringOperand("N");
        Operand op2a = new StringOperand("R");
        Operand op3a = new StringOperand("A");
        Operand op4a = new StringOperand("A");
        Operand[] opS = {op1a, op2a, op3a, op4a};

        ValueFinder solution5 = new ValueFinder(opS, new StringOperand("NAR"));
        System.out.println(solution5);

        ValueFinder solution6 = new ValueFinder(opS, new StringOperand("MARA"));
        System.out.println(solution6);

        ValueFinder solution7 = new ValueFinder(opS, new StringOperand("N"));
        System.out.println(solution7);

        ValueFinder solution8 = new ValueFinder(opS, new StringOperand("C"));
        System.out.println(solution8);

        try {
            Operand[] op = {op1, op2a, op3a, op4a};//one of the operands is integer others string
            ValueFinder solution9 = new ValueFinder(op, new StringOperand("RAA"));
            System.out.println(solution9);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("");
        }
        
         

        Operand opx = new ColorOperand(ColorOperand.Color.RED);
        Operand opx1 = new ColorOperand(ColorOperand.Color.MAGENTA);
        Operand opx2 = new ColorOperand(ColorOperand.Color.BLUE);
        Operand opx3 = new ColorOperand(ColorOperand.Color.YELLOW);
        Operand[] opC = {opx, opx1, opx2, opx3};
        ValueFinder solution9 = new ValueFinder(opC, new ColorOperand(ColorOperand.Color.RED));
        System.out.println(solution9);

        ValueFinder solution10 = new ValueFinder(opC, new ColorOperand(ColorOperand.Color.WHITE));
        System.out.println(solution10);

        ValueFinder solution11 = new ValueFinder(opC, new ColorOperand(ColorOperand.Color.GREEN));
        System.out.println(solution11);
    }

}
