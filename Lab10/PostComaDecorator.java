public class PostComaDecorator extends Decorator {
    public PostComaDecorator(Goal goal) {
        super(goal);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(",");
    }
}
