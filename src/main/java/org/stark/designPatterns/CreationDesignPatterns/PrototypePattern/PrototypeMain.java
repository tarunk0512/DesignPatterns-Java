package org.stark.designPatterns.CreationDesignPatterns.PrototypePattern;

public class PrototypeMain {
    public static void main(String[] args) {
        Document original = new Document("Original Content");
        Document copy = original.clone();

        original.print();
        copy.print();

        copy.setContent("Copied Content");
        copy.print(); // different content now
    }
}
