package com.codeclan.example.wordcounter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Louise on 23/05/2017.
 */
public class WordCounterTest {

    @Test
    public void getInput(){
        WordCounter wordCounter = new WordCounter("This is a string");
        assertEquals("This is a string", wordCounter.getUserInput());
    }

    @Test
    public void getTheWordCount(){
        WordCounter wordCounter = new WordCounter("This is a different string");
        assertEquals(5, wordCounter.getWordCount());
    }



}