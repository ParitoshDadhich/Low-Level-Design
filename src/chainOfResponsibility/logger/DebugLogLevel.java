package chainOfResponsibility.logger;

public class DebugLogLevel extends LogProcessor{
    DebugLogLevel(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(LogLevel logLevel, String message){
        if(logLevel.equals(LogLevel.Debug)){
            System.out.println("Debug: " + message);
        }
        else{
            super.log(logLevel, message);
        }
    }
}
