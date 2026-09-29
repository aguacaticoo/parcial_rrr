
public class LogLevels {

    public static String message(String logLine) {

        String[] parts = logLine.split(":", 2);

        String result = parts[1].trim();

        return result;
    }

    public static String logLevel(String logLine) {

        String[] parts = logLine.split(":", 2);

        String level = parts[0].replace("[", "").replace("]", "");

        String result = level.toLowerCase();

        return result;
    }

    public static String reformat(String logLine) {

        String result = message(logLine) + " (" + logLevel(logLine) + ")";

        return result;
    }

    public static void main(String[] args) {

        String logLine = "[ERROR]: Something went wrong";

        System.out.println("Log original: " + logLine);
        System.out.println();

        System.out.println("Mensaje: " + message(logLine));
        System.out.println("Nivel: " + logLevel(logLine));
        System.out.println("Reformateado: " + reformat(logLine));
    }
}
