package numberwordcountdownproject;

import java.util.ArrayList;
import java.util.Arrays;

class ValueFinder {

    String values;
    Operand expectedResult;
    Operand closestResult;
    ArrayList<Operand> valuePool = new ArrayList<>();

    public ValueFinder(Operand[] valuePool, Operand expectedResult) {
        this.expectedResult = expectedResult;
        this.values = Arrays.toString(valuePool);
        verifyOperandConsistency(valuePool);
        this.valuePool.addAll(Arrays.asList(valuePool));
        closestResult = searchSolution(this.valuePool);
    }

    private void verifyOperandConsistency(Operand[] valuePool) {
        if (valuePool == null) {
            throw new NullPointerException("Value pool is null!");
        } else {
            if (valuePool.length == 0) {
                throw new IllegalStateException("There is no element to generate a expected result");
            } else {
                String type = valuePool[0].getClass().getName();
                for (Operand operand : valuePool) {
                    if (!operand.getClass().getName().equals(type) || operand.getClass() != expectedResult.getClass()) {
                        throw new IllegalArgumentException("Elements of array have to belong same class ");
                    }
                }
            }
        }
    }

    public Operand searchSolution(ArrayList<Operand> ops) {
        for (Operand op1 : ops) {
            if (expectedResult.distance(closestResult) == 0) {
                break;
            } else {
                Operand canBeCloser = op1;
                changeClosestValue(canBeCloser);
                ArrayList<Operand> newPool = new ArrayList<>();
                newPool.addAll(ops);
                newPool.remove(canBeCloser);
                solve(newPool, canBeCloser);
            }
        }
        return closestResult;
    }

    public Operand solve(ArrayList<Operand> pool, Operand op) {

        if (expectedResult.distance(closestResult) == 0) {
            return closestResult;
        } else {
            for (Operand element : pool) {
                if (!pool.isEmpty()) {

                    Operand canBeCloser = op.add(element);
                    changeClosestValue(canBeCloser);
                    ArrayList<Operand> newPool = removeAndClone(pool, element);
                    solve(newPool, canBeCloser);

                    canBeCloser = op.multiply(element);
                    changeClosestValue(canBeCloser);
                    newPool = removeAndClone(pool, element);
                    solve(newPool, canBeCloser);

                    canBeCloser = op.subtract(element);
                    changeClosestValue(canBeCloser);
                    newPool = removeAndClone(pool, element);
                    solve(newPool, canBeCloser);
                }
            }
        }

        return closestResult;
    }

    public void changeClosestValue(Operand canBeCloser) {
        if (closestResult == null) {
            closestResult = canBeCloser;
        } else {
            if (canBeCloser.distance(expectedResult) < closestResult.distance(expectedResult)) {
                closestResult = canBeCloser;
            }
        }
    }

    public ArrayList<Operand> removeAndClone(ArrayList<Operand> arr, Operand index) {
        ArrayList<Operand> newArr = new ArrayList<>();
        newArr.addAll(arr);
        newArr.remove(index);
        return newArr;
    }

    @Override

    public String toString() {
        return "Value pool = " + values + "\nTarget value = " + expectedResult
                + "\nObtained solution is " + closestResult.getSolution() + "\nObtained number is "
                + closestResult + "\n";
    }

}
