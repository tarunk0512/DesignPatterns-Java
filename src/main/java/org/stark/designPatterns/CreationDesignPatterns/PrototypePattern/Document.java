package org.stark.designPatterns.CreationDesignPatterns.PrototypePattern;

class Document implements Cloneable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Document clone() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone failed");
        }
    }

    public void print() {
        System.out.println("Content: " + content);
    }
}
