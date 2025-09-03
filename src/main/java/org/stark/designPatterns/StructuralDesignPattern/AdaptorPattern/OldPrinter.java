package org.stark.designPatterns.StructuralDesignPattern.AdaptorPattern;

// Third-party library class with incompatible method
class OldPrinter {
    void printOldWay(String text) {
        System.out.println("Old Printer: " + text);
    }
}