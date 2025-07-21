package com.micro;

public class A_MainclassImplementAinterface implements A {// only class can implement key word use to implement interface
  //  Class extends class
//🔥 Interface extends interface
//🔥 Class implements interface

    // ✅ Abstract method override
    @Override
    public void m1() {
        System.out.println("Implemented m1() in MainClass");
    }

    // ✅ Optional overrides (default methods)
    @Override
    public void m3(int a) { // it calling from main class with value 100
        System.out.println("Overriding default method m3(int): " + a);//100
    }

    @Override
    public void m3() {
        System.out.println("Overriding default method m3()");
        A.super.m3();//it going parent clas A
    }

    public static void main(String[] args) {
        A_MainclassImplementAinterface obj = new A_MainclassImplementAinterface();

        // 🔸 Abstract method
        obj.m1(); // ✅//Implemented m1() in MainClass

        // 🔸 Default methods (inherited)
        obj.m3();      // ✅ will internally call private `log()`
        obj.m3(100);   // ✅

        // 🔸 Static methods (called via interface name)
        A.m2();           // ✅ will internally call private static `logStatic()`
        A.m2("From main");     // ✅

        // 🔸 ❌ The below will NOT compile (private methods)
        // obj.m4();          // ❌ private method, not accessible
        // obj.m4("Hi");      // ❌ private method with param
        // A.logStatic();     // ❌ private static method, not accessible
        // obj.log();         // ❌ private, not accessible



    }
}
