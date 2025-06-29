/*
 * Copyright (C) 2025 eliseHtw
 *
 * This program is free software under the terms of GPLv3.
 * See the GNU General Public License for more details.
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package de.htw_berlin.fb4.elise;

/**
 * Utility class to analyze text and provide statistics.
 */
public class TextStatistics {
    
    /**
     * Counts the number of words in a text.
     * 
     * @param text the text to analyze
     * @return the number of words
     */
    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        return text.split("\\s+").length;
    }

    /**
     * Counts only the letters in a text (no spaces or punctuation marks).
     * 
     * @param text the text to analyze
     * @return the number of letters
     */
    public static int countLettersOnly(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        return text.replaceAll("[^a-zA-ZäöüÄÖÜß]", "").length();
    }
    
    /**
     * Counts the number of characters in a text, excluding leading and trailing whitespace.
     * 
     * @param text the text to analyze
     * @return the number of characters (without leading/trailing whitespace)
     */
    public static int countCharacters(String text) {
        if (text == null) {
            return 0;
        }
        return text.trim().length();
    }
    
    /**
     * Counts the number of sentences in a text based on sentence-ending punctuation.
     * 
     * @param text the text to analyze
     * @return the number of sentences
     */
    public static int countSentences(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        return text.split("[.!?]+").length;
    }
    
    /**
     * Estimates the reading time in seconds based on an average reading speed of 200 words per minute.
     * 
     * @param text the text to analyze
     * @return the estimated reading time in seconds
     */
    public static int estimateReadingTimeInSeconds(String text) {
        int words = countWords(text);
        // 200 words per minute = 3.333... words per second
        return (int) Math.ceil(words / 3.333);
    }
    
    /**
     * Generates a complete statistics report for a given text.
     * 
     * @param text the text to analyze
     * @return a formatted string containing the statistics
     */
    public static String generateStatisticsReport(String text) {
        int words = countWords(text);
        int characters = countCharacters(text);
        int lettersOnly = countLettersOnly(text);
        int sentences = countSentences(text);
        int readingTimeSeconds = estimateReadingTimeInSeconds(text);
        
        return String.format(
            "Statistik für mit ProseBuilder generierten Text:\n" +
            "------------------------------------------------\n" +
            "Wörter: %d\n" +
            "Zeichen (gesamt): %d\n" +
            "Buchstaben (ohne Leerzeichen/Satzzeichen): %d\n" +
            "Sätze: %d\n" +
            "Geschätzte Lesezeit: %d Sekunden",
            words, characters, lettersOnly, sentences, readingTimeSeconds
        );
    }
    
}
