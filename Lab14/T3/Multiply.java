package T_3_3;

public class Multiply extends AbstractOperation {
    @Override
    public double calculate(double x, double y, String  operation) {
        double result = 0;

        if (operation.equals("*")) {
            result = x * y;
        } else if (nextOperation != null) {
            result = nextOperation.calculate(x, y, operation);
        }

        return result;
    }
}
