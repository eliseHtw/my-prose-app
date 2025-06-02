package de.htw_berlin.fb4.elise;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class SimpleSentence implements Sentence {

    // private String sentence = "Ein Beispielsatz";

    /* public SimpleSentence(String sentence) {
        this.sentence = sentence;
    } */

    @Override
    public String get() {
        return "Ich esse heute Abend Salat";
    }
}