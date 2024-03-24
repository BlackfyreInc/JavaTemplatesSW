package task_3_2;

public class CustomStringBuilder {
    private final CustomString string;

    public CustomStringBuilder() {
        this.string = new CustomString();
    }

    public void append(String string) {
        this.string.append(string);
    }

    public void append(CustomString string) {
        append(string.getString());
    }

    public void insert(String string, int index) {
        this.string.insert(string, index);
    }

    public void insert(CustomString string, int index) {
        insert(string.getString(), index);
    }

    public void replace(String string, int startIndex, int length) {
        this.string.replace(string, startIndex, length);
    }

    public void replace(CustomString string, int start, int length) {
        replace(string.getString(), start, length);
    }

    public void deleteSubstring(int startIndex, int length) {
        this.string.deleteSubString(startIndex, length);
    }

    public CustomString build() {
        return this.string;
    }
}
