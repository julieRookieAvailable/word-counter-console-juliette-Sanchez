package com.juliette.sanchez.wordcounter.output;

import com.juliette.sanchez.wordcounter.logger.AppLogger;
import java.util.Map;

public class ConsoleOutput {

    public void printWordCounts(Map<String, Integer> wordCounts) {
        AppLogger.info("Printing word counts...");
        for(Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        AppLogger.info("Word counts printed successfully");
    }
}