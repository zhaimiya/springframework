package org.example.aop1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public String HelloWord(String[] args) {
        System.out.println();
        System.out.println("args: "+ Arrays.toString(args));
        System.out.println("null list: " + Arrays.asList(new ArrayList<String>()));
        System.out.println();
        return "Hello World!";
    }
}
