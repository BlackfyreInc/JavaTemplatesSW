public class PostSpaceDecorator extends Decorator {
    public PostSpaceDecorator(Goal goal) {
        super(goal);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" ");
    }
}
