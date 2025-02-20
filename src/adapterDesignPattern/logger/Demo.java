package adapterDesignPattern.logger;

public class Demo {
    public static void main(String[] args) {
        MordernLogger mordernLogger = new MordernLoggerImpl();
        LegacyLogger legacyLogger = new AdapterLogger(mordernLogger);
        legacyLogger.logToFile();
    }
}
