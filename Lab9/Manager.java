public class Manager implements Employee {
    private final String name;
    private final int salary;

    public Manager(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void payExpenses() {
        System.out.println(name + " has been paid EUR " + salary);
    }
}
