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
        System.out.println(proseBuilder.get());
    }
}
