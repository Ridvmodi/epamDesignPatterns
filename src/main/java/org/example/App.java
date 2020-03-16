package org.example;
import java.io.*;
import org.example.behavioural.AdapterPattern;
import org.example.behavioural.ProxyPattern;
import org.example.creational.FactoryMethodPattern;
import org.example.creational.PrototypeDesignPattern;
import org.example.structural.IteratorPattern;
import org.example.structural.TemplatePattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {

//        System.out.println( "Hello World!" );
        AdapterPattern Ap=new AdapterPattern();
        ProxyPattern PP=new ProxyPattern();
        FactoryMethodPattern FMP=new FactoryMethodPattern();
        PrototypeDesignPattern PDP=new PrototypeDesignPattern();
        IteratorPattern IP=new IteratorPattern();
        TemplatePattern TP=new TemplatePattern();
    }
}
