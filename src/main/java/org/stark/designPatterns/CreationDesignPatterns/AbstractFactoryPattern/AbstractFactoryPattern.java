package org.stark.designPatterns.CreationDesignPatterns.AbstractFactoryPattern;

public class AbstractFactoryPattern {

    public static void main(String[] args) {
        // Let's use WindowsFactory
        GUIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();       // Output: Windows Button
        checkbox.render();     // Output: Windows Checkbox

        // Now using MacFactory
        factory = new MacFactory();
        button = factory.createButton();
        checkbox = factory.createCheckbox();

        button.render();       // Output: Mac Button
        checkbox.render();     // Output: Mac Checkbox
    }
}





