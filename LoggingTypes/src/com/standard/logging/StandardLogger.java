package com.standard.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StandardLogger {
   static final private  Logger logger = Logger.getLogger(StandardLogger.class.getName());
	public static void main(String[] args) {
		    logger.setLevel(Level.ALL);
	        ConsoleHandler consoleHandler  = new ConsoleHandler();
	        consoleHandler.setLevel(Level.FINEST);           
	        System.out.println("Logging level is: " + logger.getLevel());
	        logger.log(CustomLevel.DEBUG, " custom message");
	    /*    logger.log(Level.FINEST, "messsage");
	        logger.log(Level.FINER, "messsage"); 
	        logger.log(Level.FINE, "messsage");
	        logger.log(Level.CONFIG, "messsage");
	        logger.log(Level.INFO, "messsage");
	        logger.log(Level.WARNING, "messsage");
	        logger.log(Level.SEVERE, "messsage");
	    */}
	}


