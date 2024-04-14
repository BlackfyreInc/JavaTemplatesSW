public class PostEndlDecorator extends Decorator {
    public PostEndlDecorator(Goal goal) {
        super(goal);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("\n");
    }
}
