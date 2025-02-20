package commandDesignPattern.undoFunctionality;

public class CommandTurnOff implements Command{
    AirConditioner ac;
    CommandTurnOff(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOf();
    }

    @Override
    public void undo() {
        ac.turnOn();
    }
}
