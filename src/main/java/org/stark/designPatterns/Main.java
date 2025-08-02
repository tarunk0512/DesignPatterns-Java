package org.stark.designPatterns;

import org.stark.designPatterns.CreationDesignPatterns.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SingletonPattern s1 = SingletonPattern.getInstance();
        SingletonPattern s2 = SingletonPattern.getInstance();
        System.out.println(s1 == s2); // true (same object)
        s1.showMessage();
    }
}