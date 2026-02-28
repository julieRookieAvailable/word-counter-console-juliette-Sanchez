package com.juliette.sanchez.wordcounter;

import com.juliette.sanchez.wordcounter.processor.WordCounter;
import org.junit.jupiter.api.Test;

import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCounterTest {

    @Test
    void testWordCounting() {
        WordCounter counter = new WordCounter();
        String paragraph = "Module one and module two";

        Map<String, Integer> result = counter.countWords(paragraph);

        assertEquals(2, result.get("module"));
        assertEquals(1, result.get("one"));
        assertEquals(1, result.get("and"));
        assertEquals(1, result.get("two"));
    }

    @Test
    void testEmptyParagraph() {
        WordCounter counter = new WordCounter();
        Map<String, Integer> result = counter.countWords("");
        assertEquals(0, result.size());
    }
}