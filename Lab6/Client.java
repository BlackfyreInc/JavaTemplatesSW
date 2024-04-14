public class Client {
    public void execute() {
        String filename = "src/ReadFile.txt";

        TextEditor textEditor_1 = TextEditor.getInstance();
        String file_content = textEditor_1.read(filename);
        System.out.println(file_content);

        TextEditor textEditor_2 = TextEditor.getInstance();
        String content_replaced = textEditor_2.replace(
                filename, "wider", "taller");
        System.out.println(content_replaced);
    }
}
