package chainOfResponsibility.logger;

public class LogProcessor {
    LogProcessor nextLogProcessor;
    LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(LogLevel logLevel, String message){
        if(nextLogProcessor != null){
            nextLogProcessor.log(logLevel, message);
        }
    }
}
