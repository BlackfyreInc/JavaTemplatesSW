package T_3_3;

public class Client {

    public static void main(String[] args) {
        AbstractOperation add = new Add();
        AbstractOperation subtract = new Subtract();
        AbstractOperation multiply = new Multiply();
        AbstractOperation divide = new Divide();

        add.setNextOperation(subtract);
        subtract.setNextOperation(multiply);
        multiply.setNextOperation(divide);

        print(2, 2, "+", add);
        print(5, 2, "-", add);
        print(2, 3, "*", add);
        print(20, 5, "/", add);
    }

    public static void print(double x, double y, String operation, AbstractOperation calculator) {
        System.out.printf("%f %s %f = %f\n", x, operation, y, calculator.calculate(x, y, operation));
    }

}
