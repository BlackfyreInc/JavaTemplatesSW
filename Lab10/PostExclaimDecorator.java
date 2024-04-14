public class PostExclaimDecorator extends Decorator {
    public PostExclaimDecorator(Goal goal) {
        super(goal);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("!");
    }
}
