package com.brpan.bigidiot;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Log logger = LogFactory.getLog(App.class);
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        logger.trace("trace message");
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.error("error message");
        logger.fatal("fatal message");
    }
}
