package chainOfResponsibility.logger;

public class ErrorLogLevel extends LogProcessor{
    ErrorLogLevel(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(LogLevel logLevel, String message){
        if(logLevel.equals(LogLevel.Error)){
            System.out.println("Error: " + message);
        }
        else{
            super.log(logLevel, message);
        }
    }
}
