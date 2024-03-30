import java.util.ArrayList;

public class EquationsPrototypeClient {
    public void execute() {

        ArrayList<Integer> nums_1 = new ArrayList<>();
        nums_1.add(2);
        nums_1.add(5);
        Equation equation_1 = new Equation(nums_1);
        Equation equation_clone_1 = equation_1.clone();

        ArrayList<Integer> nums_2 = new ArrayList<>();
        nums_2.add(2);
        nums_2.add(5);
        nums_2.add(1);
        QuadraticEquation equation_2 = new QuadraticEquation(nums_2);
        Equation equation_clone_2 = equation_2.clone();

        System.out.println("eq 1 res: " + equation_1.solve());
        System.out.println("eq 1 cloned res: " + equation_clone_1.solve());
        System.out.println("eq 2 res: " + equation_2.solve());
        System.out.println("eq 2 cloned res: " + equation_clone_2.solve());
    }
}
