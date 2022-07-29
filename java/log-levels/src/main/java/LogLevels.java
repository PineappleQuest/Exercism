public class LogLevels {

    // Log Levels
    public static String message (String logLine) {
        String[] logLine1 = logLine.split(":");
        return (logLine1[1].trim());
    }

    public static String logLevel(String logLine) {
        String[] logLine1 = logLine.split("[\\[\\]:]");
        return (logLine1[1].toLowerCase());
    }

    public static String reformat(String logLine) {
        String[] logline1 = logLine.split("[\\[\\]:]");
        return (logline1[3].trim() + " (" + logline1[1].toLowerCase() + ")");
    }
}
