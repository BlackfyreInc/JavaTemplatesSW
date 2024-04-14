public class PostWordDecorator extends Decorator {
    private final String word;

    public PostWordDecorator(Goal goal, String word) {
        super(goal);
        this.word = word;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(word);
    }
}
