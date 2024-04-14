public class Main {
    public static void main(String[] args) {
        Goal swreference = new PrintableString("");
        swreference = new PostComaDecorator(swreference);
        swreference = new PostSpaceDecorator(swreference);
        swreference = new PreWordDecorator(swreference, "Hello");
        swreference = new PostWordDecorator(swreference, "There");
        swreference = new PostExclaimDecorator(swreference);
        swreference = new PostEndlDecorator(swreference);
        swreference.print();
    }
}
