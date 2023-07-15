import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;
    private static Logger logger;

    private Logger() {
    }

    public void log(String msg) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("MM.dd.yyyy hh:mm:ss");
        System.out.println("[" + formatForDateNow.format(dateNow) + " " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}