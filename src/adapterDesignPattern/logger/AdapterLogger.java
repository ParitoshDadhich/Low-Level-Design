package adapterDesignPattern.logger;

public class AdapterLogger extends LegacyLoggerImpl{
    MordernLogger mordernLogger;
    AdapterLogger(MordernLogger mordernLogger){
        this.mordernLogger = mordernLogger;
    }

    @Override
    public void logToFile(){
        mordernLogger.logToConsole();
    }

}
