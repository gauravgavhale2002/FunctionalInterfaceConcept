package com.micro;

import java.util.Arrays;
import java.util.List;

public class F_MainClass {
    public static void main(String[] args) {

        // Lambda expression
        F_FunctionalInterface_with_lambda obj = (task) -> {
            System.out.println("Performing task: " + task);
        };

        // Method reference to static method in interface
        F_FunctionalInterface_with_lambda obj2 = F_FunctionalInterface_with_lambda::printTask;

        obj.performTask("Code review");
        obj.greet();
        obj.greetUser("Gaurav");

        obj2.performTask("Review using method reference");

        F_FunctionalInterface_with_lambda.printInfo();
        F_FunctionalInterface_with_lambda.version();


        List<String> names = Arrays.asList("A", "B", "C");

        // Using lambda
        names.forEach(name -> System.out.println(name));

        // Using method reference
        names.forEach(System.out::println);

        List<String> names2 = Arrays.asList("Gaurav", "Yash", "Om");
        names2.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
