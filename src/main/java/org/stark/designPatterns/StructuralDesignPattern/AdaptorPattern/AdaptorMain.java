package org.stark.designPatterns.StructuralDesignPattern.AdaptorPattern;

public class AdaptorMain {
    public static void main(String[] args) {
        ModernPrinter printer = new PrinterAdapter(new OldPrinter());
        printer.print("Hello Adapter!");
    }

}

