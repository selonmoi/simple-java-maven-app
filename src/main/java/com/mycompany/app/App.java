package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        System.out.println("First test");
        System.out.println("First test 2");
    }

    private final String getMessage() {
        return message;
    }

}
