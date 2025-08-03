package org.stark.designPatterns.CreationDesignPatterns.BuilderPattern;

public class BuilderMain {
    public static void main(String[] args) {
        User user = new User.Builder()
                .name("Tarun")
                .email("tarun@example.com")
                .age(25)
                .build();
        user.printUser();

    }
}
