package utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerConfig {

    private static final Logger LOGGER = LogManager.getLogger(LoggerConfig.class);

    public static Logger getLogger() {
        return LOGGER;
    }

}
