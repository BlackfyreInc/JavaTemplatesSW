public abstract class Decorator implements Goal {
    private final Goal wrapper;

    public Decorator(Goal goal) {
        this.wrapper = goal;
    }

    @Override
    public void print() {
        wrapper.print();
    }
}
