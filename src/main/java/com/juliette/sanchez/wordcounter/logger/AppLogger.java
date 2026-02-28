package com.juliette.sanchez.wordcounter.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AppLogger {
    private static final Logger logger = Logger.getLogger(AppLogger.class.getName());

    public static void info(String msg) {
        logger.log(Level.INFO, msg);
    }

    public static void error(String msg, Exception e) {
        logger.log(Level.SEVERE, msg, e);
    }
}