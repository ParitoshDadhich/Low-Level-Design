package commandDesignPattern.undoFunctionality;

public class AirConditioner implements Switchable{
    private boolean isOn;
    private int temperature;

    public void turnOn(){
        this.isOn = true;
        System.out.println("AC is on!!");
    }

    public void turnOf(){
        this.isOn = false;
        System.out.println("Ac is of!!");
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
}
