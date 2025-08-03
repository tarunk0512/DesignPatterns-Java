package org.stark.designPatterns.CreationDesignPatterns.AbstractFactoryPattern;

// Concrete Products
class WindowsButton implements Button {
    public void render() {
        System.out.println("Windows Button");
    }
}
