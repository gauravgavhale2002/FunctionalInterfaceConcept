package com.micro;


public class B_MainClassExtends implements  B{
//public class B_MainClassExtends extends B{
    //Class cannot extend an interface iw will give compilemtime error
    // we cant use extend key word so that why we use implements
    @Override
    public void oneAbstract() {
    System.out.println("MianClas Overridden method ");
    }


    // ✅ Optional overrides (default methods)
    @Override
    public void m3(int a) { // it calling from main class with value 100
        System.out.println("Overriding default method m3(int): " + a);//100
    }

    @Override
    public void m3() {

        System.out.println("Overriding default method m3()");
        B.super.m3();//it going parent clas A
    }


    public void simpleMethod() {
        System.out.println("Simple Simple method");
    }

    public final void showFinal() {// it will work it not belogs to interfcae it belongs to class
        System.out.println("Final method in class");
    }

    public static void main(String[] args) {
        B_MainClassExtends obj = new B_MainClassExtends();

        // 🔸 Abstract method
        obj.oneAbstract(); // ✅//Implemented m1() in MainClass

        // 🔸 Default methods (inherited)
        obj.m3();      // ✅ will internally call private `log()`
        obj.m3(100);   // ✅


        obj.simpleMethod();//Simple Simple method
        obj.showFinal();//Final method in class

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
