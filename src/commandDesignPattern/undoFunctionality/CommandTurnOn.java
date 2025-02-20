package commandDesignPattern.undoFunctionality;

public class CommandTurnOn implements Command{
    AirConditioner ac;

    CommandTurnOn(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }

    @Override
    public void undo() {
        ac.turnOf();
    }
}
