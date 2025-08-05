package com.micro;

public class Java_8  {

    public static void main(String[] args) {
        // Java 8 features can be demonstrated here
        // For example, using lambda expressions, streams, etc.

        // Example of a lambda expression
        Runnable runnable = () -> System.out.println("Hello from a lambda expression!");
        runnable.run();

        // Example of a stream operation
        java.util.List<String> names = java.util.Arrays.asList("Alice", "Bob", "Charlie");
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
    }
}
