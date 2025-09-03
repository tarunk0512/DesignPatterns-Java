package org.stark.designPatterns.StructuralDesignPattern.AdaptorPattern;

// Adapter class: converts ModernPrinter interface → OldPrinter implementation
class PrinterAdapter implements ModernPrinter {
    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void print(String text) {
        oldPrinter.printOldWay(text); // Call old method internally
    }
}