package chainOfResponsibility.logger;

public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(LogLevel logLevel, String message){
        if(logLevel.equals(LogLevel.Info)){
            System.out.println("Info: " + message);
        }
        else{
            super.log(logLevel, message);
        }
    }
}
