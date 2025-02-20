package chainOfResponsibility.logger;

public class Main {
    public static void main(String[] args) {
//        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogLevel(new ErrorLogLevel(null)));
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogLevel(null));

        logProcessor.log(LogLevel.Info, "This is info level");
        logProcessor.log(LogLevel.Error, "This is error level");
        logProcessor.log(LogLevel.Debug, "This is debug level");
    }
}
