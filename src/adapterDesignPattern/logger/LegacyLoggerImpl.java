package adapterDesignPattern.logger;

public class LegacyLoggerImpl implements LegacyLogger{
    @Override
    public void logToFile() {
        System.out.println("Log to File!");
    }
}
