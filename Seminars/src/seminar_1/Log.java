package seminar_1;

import java.io.FileInputStream;
import java.util.logging.Logger;
import java.util.logging.LogManager;

public class Log {
    static {
        try (FileInputStream in = new FileInputStream("log.config")) { // относительный путь до файла с конфигами
            LogManager.getLogManager().readConfiguration(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static Logger log(String className) {
        return Logger.getLogger(className);
    }
}
