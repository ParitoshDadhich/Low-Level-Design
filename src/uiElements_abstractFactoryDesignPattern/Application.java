package uiElements_abstractFactoryDesignPattern;

public class Application {
    private Button button;
    private CheckBox checkBox;

    Application( GuiFactory guiFactory){
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckBox();
    }

    public void createUIButton(){
        this.button.button();
    }

    public void createUICheeckBox(){
        this.checkBox.checkBox();
    }
}
