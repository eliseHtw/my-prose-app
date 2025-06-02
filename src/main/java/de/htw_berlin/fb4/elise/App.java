package de.htw_berlin.fb4.elise;

import de.htw_berlin.fb4.ossd.prose.Prose;
import de.htw_berlin.fb4.ossd.prose.ProseBuilder;
import de.htw_berlin.fb4.ossd.prose.Sentence;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Sentence s1 = new SimpleSentence();

        ProseBuilder proseBuilder = new ProseBuilder();
        proseBuilder.register(s1);
        System.out.println(proseBuilder.get());
    }
}
