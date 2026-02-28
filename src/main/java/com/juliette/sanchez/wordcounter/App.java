package com.juliette.sanchez.wordcounter;

import com.juliette.sanchez.wordcounter.input.ConsoleInput;
import com.juliette.sanchez.wordcounter.processor.WordCounter;
import com.juliette.sanchez.wordcounter.output.ConsoleOutput;
import com.juliette.sanchez.wordcounter.logger.AppLogger;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        try {
            ConsoleInput input = new ConsoleInput();
            String paragraph = input.getParagraph();

            WordCounter processor = new WordCounter();
            Map<String, Integer> wordCounts = processor.countWords(paragraph);

            ConsoleOutput output = new ConsoleOutput();
            output.printWordCounts(wordCounts);

            AppLogger.info("Application executed successfully");
        } catch (Exception e) {
            AppLogger.error("Unexpected error occurred in application", e);
        }
    }
}