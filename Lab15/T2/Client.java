package T_3_2;

public class Client {
    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();
        textEditor.newDocument("doc.txt");

        textEditor.clickSaveButton();
        textEditor.clickPrintButton();
        textEditor.selectPrintMenuItem();
        textEditor.selectSaveMenuItem();
        textEditor.pressPrintShortcut();
        textEditor.pressSaveShortcut();
    }
}
