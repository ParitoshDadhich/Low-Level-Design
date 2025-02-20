package commandDesignPattern.undoFunctionality;

public class Bulb implements Switchable{
    private boolean isOn;

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOf(){
        this.isOn = false;
    }
}
