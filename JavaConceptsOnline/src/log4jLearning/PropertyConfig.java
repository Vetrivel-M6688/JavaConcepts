package log4jLearning;
import org.apache.logging.log4j.*;

public class PropertyConfig {

	public static Logger fileLogger = LogManager.getLogger(PropertyConfig.class);
	public static void main(String[] args) {


		fileLogger.info("Information");
		fileLogger.debug("Debug");
		fileLogger.warn("Warning");
		fileLogger.error("Error");
		fileLogger.fatal("Fatal");
	}

}
