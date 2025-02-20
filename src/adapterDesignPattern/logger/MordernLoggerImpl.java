package adapterDesignPattern.logger;

public class MordernLoggerImpl implements MordernLogger{
    @Override
    public void logToConsole() {
        System.out.println("Log To Console!");
    }
}
