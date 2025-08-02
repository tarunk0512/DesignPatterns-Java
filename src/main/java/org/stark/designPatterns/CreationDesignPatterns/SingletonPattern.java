package org.stark.designPatterns.CreationDesignPatterns;

public class SingletonPattern {
    private static SingletonPattern instance;

    // Private constructor prevents instantiation
    private SingletonPattern() {}

    public static synchronized SingletonPattern getInstance() {
        if (instance == null)
            instance = new SingletonPattern();
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton instance invoked!");
    }
}
