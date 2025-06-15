package de.htw_berlin.fb4.elise;

import de.htw_berlin.fb4.ossd.prose.Sentence;

/**
 * Represents a simple sentence with a fixed text content.
 */
public class SimpleSentence implements Sentence {
    /**
     * Returns the fixed sentence content.
     *
     * @return the fixed sentence "Ich esse heute Abend Salat"
     */
    @Override
    public String get() {
        return "Ich esse heute Abend Salat";
    }
}