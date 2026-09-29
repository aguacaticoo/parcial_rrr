
enum LogLevel {
    TRACE,
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL
}

public class LogLine {

    private final String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {

        String level = logLine.substring(1, 4);

        switch (level) {
            case "TRC":
                return LogLevel.TRACE;

            case "DBG":
                return LogLevel.DEBUG;

            case "INF":
                return LogLevel.INFO;

            case "WRN":
                return LogLevel.WARNING;

            case "ERR":
                return LogLevel.ERROR;

            case "FTL":
                return LogLevel.FATAL;

            default:
                throw new IllegalArgumentException("Nivel desconocido");
        }
    }

    public static void main(String[] args) {

        LogLine logLine = new LogLine("[INF]: File deleted");

        System.out.println("Log original: [INF]: File deleted");
        System.out.println("Nivel: " + logLine.getLogLevel());
    }
}
