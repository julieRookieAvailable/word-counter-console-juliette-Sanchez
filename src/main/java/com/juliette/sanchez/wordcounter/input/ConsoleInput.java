package com.juliette.sanchez.wordcounter.input;

import com.juliette.sanchez.wordcounter.logger.AppLogger;
import java.util.Scanner;

public class ConsoleInput {
    private final Scanner scanner = new Scanner(System.in);

    public String getParagraph() {
        AppLogger.info("Waiting for user input...");
        System.out.println("Please enter a paragraph:");
        String input = scanner.nextLine();
        AppLogger.info("User input received");
        return input;
    }
}