public class PreWordDecorator extends Decorator {
    private final String word;

    public PreWordDecorator(Goal goal, String word) {
        super(goal);
        this.word = word;
    }

    @Override
    public void print() {
        System.out.print(word);
        super.print();
    }
}
