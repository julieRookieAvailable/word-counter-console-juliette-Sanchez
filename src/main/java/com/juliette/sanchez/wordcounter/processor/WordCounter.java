package com.juliette.sanchez.wordcounter.processor;

import com.juliette.sanchez.wordcounter.logger.AppLogger;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public Map<String, Integer> countWords(String paragraph) {
        Map<String, Integer> wordCounts = new HashMap<>();
        try {
            if(paragraph == null || paragraph.isEmpty()) {
                AppLogger.info("Empty paragraph received");
                return wordCounts;
            }

            String[] words = paragraph.trim().split("\\s+");

            for(String word : words) {
                String key = word.toLowerCase();
                wordCounts.put(key, wordCounts.getOrDefault(key, 0) + 1);
            }

            AppLogger.info("Word counting completed successfully");
        } catch (Exception e) {
            AppLogger.error("Error counting words", e);
        }

        return wordCounts;
    }
}