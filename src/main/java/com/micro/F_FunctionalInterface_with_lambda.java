package com.micro;
@FunctionalInterface
public interface F_FunctionalInterface_with_lambda {

    // ✅ Only ONE abstract method → Required for Lambda
    void performTask(String task);

    public static void printTask(String task) {
        System.out.println(">>> " + task);
    }

    // ✅ Private method (can be used inside default methods)
    private void log(String msg) {
        System.out.println("Logging: " + msg);
        System.out.println("private void m4() {\n" +
                "        System.out.println(\"Private method from interface  Java 8 me private method interface me directly ❌ nahi likh sakte.\\n\" +\n" +
                "                \"Agar likhoge toh compiler error dega:\\n\" +\n" +
                "                \"Modifier 'private' not allowed here\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Agar tu chahe toh main ek Java 8 aur Java 9 ka live example bhi bana deta hoon comparison ke liye.\");\n" +
                "    }");
    }

    // ✅ Default method
    default void greet() {
        System.out.println("Hello from default greet() method");
        log("Default greet used"); // calling private method
    }

    // ✅ Another default method
    default void greetUser(String name) {
        System.out.println("Hello, " + name);
    }

    // ✅ Static method
    static void printInfo() {
        System.out.println("Static printInfo() method called");
    }

    static void version() {
        System.out.println("Interface version 1.0");
    }
}
