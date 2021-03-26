package Bridgelabz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hello {
	    private static final Logger LOG = LogManager.getLogger(Hello.class);
		public static void main(String[] args) {
			String message = "Hello eclips from maven project";
			LOG.debug(message + "Will be printed on debug");
			LOG.info(message + "Will be printed on info");
			LOG.warn(message + "Will be printed on warn");
			LOG.error(message + "Will be printed on error");
			LOG.fatal(message + "Will be printed on fatal");
			LOG.info(message + "Will be printed on info");
	        System.out.println(message);
	    }
}
