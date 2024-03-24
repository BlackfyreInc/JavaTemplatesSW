package task_3_2;

public class CustomString {
    private String string;

    public CustomString(String string) {
        this.string = string;
    }

    public CustomString() {
        this.string = "";
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return this.string;
    }

    public void append(String content) {
        this.string += content;
    }

    public void append(CustomString content) {
        append(content.getString());
    }

    public void insert(String content, int index) {
        if (index < 0 || index > this.string.length()) {
            throw new IndexOutOfBoundsException();
        }
        this.string = this.string.substring(0, index) + content + this.string.substring(index);
    }

    public void insert(CustomString str, int index) {
        insert(str.getString(), index);
    }

    public void replace(String content, int start, int length) {
        if (start < 0 ||
                start > this.string.length() ||
                length < 0 ||
                (start + length) > this.string.length()
        ) {
            throw new IndexOutOfBoundsException();
        }
        this.string = this.string.substring(0, start) + content + this.string.substring(start + length);
    }

    public void replace(CustomString content, int start, int length) {
        replace(content.getString(), start, length);
    }

    public void deleteSubString(int startIndex, int length) {
        if (startIndex < 0 ||
                startIndex > this.string.length() ||
                length < 0 ||
                (startIndex + length) > this.string.length()
        ) {
            throw new IndexOutOfBoundsException();
        }
        this.string = this.string.substring(0, startIndex) + this.string.substring(startIndex + length);
    }
}
