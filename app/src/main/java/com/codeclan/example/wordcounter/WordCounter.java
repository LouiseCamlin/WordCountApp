package com.codeclan.example.wordcounter;

import java.util.ArrayList;

/**
 * Created by Louise on 23/05/2017.
 */

public class WordCounter implements WordProvider {

    private String userInput;
    private String wordArray[];

    public WordCounter(String userInput){
        this.userInput = userInput;

    }

    public String getUserInput(){
        return this.userInput;

    }


    public int getWordCount() {
        wordArray = this.userInput.split(" ");
        int wordCount = wordArray.length;
        return wordCount;
    }
}
