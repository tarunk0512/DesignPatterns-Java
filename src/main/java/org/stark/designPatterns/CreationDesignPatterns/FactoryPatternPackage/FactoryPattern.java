package org.stark.designPatterns.CreationDesignPatterns.FactoryPatternPackage;

public class FactoryPattern {
    public Shape getShape(String type) {
        return switch (type.toLowerCase()) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            default -> throw new IllegalArgumentException("Unknown shape");
        };
    }
}