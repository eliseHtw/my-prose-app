/*
 * Copyright (C) 2025 eliseHtw
 *
 * This program is free software under the terms of GPLv3.
 * See the GNU General Public License for more details.
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package de.htw_berlin.fb4.elise;

import de.htw_berlin.fb4.ossd.prose.Prose;
import de.htw_berlin.fb4.ossd.prose.ProseBuilder;
import de.htw_berlin.fb4.ossd.prose.Sentence;

import java.util.List;

/**
 * Application entry point that demonstrates the usage of ProseBuilder.
 */
public class App
{
    /**
     * The main method that runs the demonstration.
     *
     * @param args the command line arguments
     */
    public static void main( String[] args )
    {
        System.out.println("Hello World!");

        Sentence s1 = new SimpleSentence();
        ProseBuilder proseBuilder = new ProseBuilder();
        proseBuilder.register(s1);
        
        String generatedText = proseBuilder.get();
        System.out.println(generatedText);
        
        // Display statistics for the generated text
        System.out.println(TextStatistics.generateStatisticsReport(generatedText));
    }
}
