package T_3_2;

public class TextEditor {

    final private Button saveButton;
    final private Button printButton;
    final private Menu saveMenu;
    final private Menu printMenu;
    final private Shortcut saveShortcut;
    final private Shortcut printShortcut;

    public TextEditor() {
        saveButton = new Button();
        printButton = new Button();

        saveMenu = new Menu();
        printMenu = new Menu();

        saveShortcut = new Shortcut();
        printShortcut = new Shortcut();
    }

    public void newDocument(String name) {
        Document document = new Document(name);

        Command saveCommand = new SaveCommand(document);
        saveButton.setCommand(saveCommand);
        saveMenu.setCommand(saveCommand);
        saveShortcut.setCommand(saveCommand);

        Command printCommand = new PrintCommand(document);
        printButton.setCommand(printCommand);
        printMenu.setCommand(printCommand);
        printShortcut.setCommand(printCommand);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickPrintButton() {
        printButton.click();
    }

    public void selectSaveMenuItem() {
        saveMenu.select();
    }

    public void selectPrintMenuItem() {
        printMenu.select();
    }

    public void pressSaveShortcut() {
        saveShortcut.press();
    }

    public void pressPrintShortcut() {
        printShortcut.press();
    }
}
