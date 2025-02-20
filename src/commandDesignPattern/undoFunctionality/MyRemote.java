package commandDesignPattern.undoFunctionality;

import java.util.Stack;

// invoker
public class MyRemote {
    private Command command;
    private Stack<Command> commandHistory = new Stack<>();

    MyRemote(){}

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        this.command.execute();
        this.commandHistory.push(command);
    }

    public void undo(){
        if(!commandHistory.isEmpty()){
            Command prevCommand = commandHistory.pop();
            prevCommand.undo();
        }
    }
}
