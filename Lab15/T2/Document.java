package T_3_2;

public class Document {

    private final String name;

    public Document(String name) {
        this.name = name;
        System.out.println("Creating new document " + name);
    }

    public void save() {
        System.out.println("Document " + name + " is saved");
    }

    public void print() {
        System.out.println("Printing - " + name);
    }
}
