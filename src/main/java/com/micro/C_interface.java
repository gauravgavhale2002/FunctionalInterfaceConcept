package com.micro;

public interface C_interface {

    public void oneAbstract();

    //  public void simpleMethod();// only one method allowed coile time it nto give erro
    // runtime it will give error

    //No, you cannot make a method final in an interface.
    // ❌ This is illegal:

       /* final void show(){
            // not allowed
        } // ❌ Compile-time error*/


    static void m2() {
        System.out.println("Static Method from interface");//calling from Inteface name E.m2() beacuse it static we
        //we cant overriiden
        logStatic(); // ✅ private static method used internally
    }

    static void m2(String s) {
        System.out.println("Static Method from interface " + s);
        // No log here
    }

    default void m3(int a) {
        System.out.println("default method from interface = " + a);
    }

    default void m3() {
        System.out.println("default method from interface");// calling from Super keyword
        log(); // ✅ private method used internally call log method
    }


    private void m4() {
        System.out.println("Private method from interface  Java 8 me private method interface me directly ❌ nahi likh sakte.\n" +
                "Agar likhoge toh compiler error dega:\n" +
                "Modifier 'private' not allowed here\n" +
                "\n" +
                "Agar tu chahe toh main ek Java 8 aur Java 9 ka live example bhi bana deta hoon comparison ke liye.");
    }

    private void m4(String s) {
        System.out.println("Private method with String from interface: " + s);
    }

    private static void logStatic() {
        System.out.println("Logging from static method from interface");
    }

    private void log() {// it calling from deafualt m3() of interface
        System.out.println("Log starting from interface method");
    }
}

