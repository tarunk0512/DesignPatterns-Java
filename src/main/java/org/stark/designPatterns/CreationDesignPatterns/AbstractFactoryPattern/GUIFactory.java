package org.stark.designPatterns.CreationDesignPatterns.AbstractFactoryPattern;

// Abstract Factory
interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
