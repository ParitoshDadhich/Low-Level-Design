package commandDesignPattern.undoFunctionality;

public class Main {
    public static void main(String[] args) {
        MyRemote acRemote = new MyRemote();

        AirConditioner ac = new AirConditioner();
        Command turnOnCommand = new CommandTurnOn(ac);
        Command turnOfCommand = new CommandTurnOff(ac);

        acRemote.setCommand(turnOnCommand);
        acRemote.pressButton();
        acRemote.undo();

        acRemote.setCommand(turnOfCommand);
        acRemote.pressButton();
        acRemote.undo();
    }

}
