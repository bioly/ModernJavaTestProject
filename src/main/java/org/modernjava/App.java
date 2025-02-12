package org.modernjava;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Modern Java Test Project
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Modern Java test project." );
        Arrays.asList(1,2,3,4).stream().forEach(System.out::println);
        Stream.of(1,2,3,4).forEach(System.out::println);
    }
}
