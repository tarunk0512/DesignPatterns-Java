package org.stark.designPatterns.CreationDesignPatterns.BuilderPattern;

public class User {
    private String name, email;
    private int age;

    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
    }

    public static class Builder {
        private String name, email;
        private int age;

        public Builder name(String name) { this.name = name; return this; }
        public Builder email(String email) { this.email = email; return this; }
        public Builder age(int age) { this.age = age; return this; }
        public User build() { return new User(this); }
    }

    public void printUser() {
        System.out.println("Name: " + name + ", Email: " + email + ", Age: " + age);
    }
}

