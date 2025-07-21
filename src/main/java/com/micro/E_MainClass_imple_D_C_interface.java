package com.micro;

public class E_MainClass_imple_D_C_interface implements D_Interface_extends_C {

    @Override
    public void oneAbstract() {
        System.out.println("Implemented oneAbstract() in class");
    }

    @Override
    public void m3(int a) {
        // Calling default method from interface using super
        D_Interface_extends_C.super.m3(a);
        System.out.println("Also overridden m3(int) in class");
    }

    @Override
    public void m3() {
        D_Interface_extends_C.super.m3(); // Call default method from interface
        System.out.println("Also overridden m3() in class");
    }

    public static void main(String[] args) {
        E_MainClass_imple_D_C_interface obj = new E_MainClass_imple_D_C_interface();

        obj.oneAbstract();     // From C_interface
        obj.m3();              // Overridden version in class
        obj.m3(10);            // Overridden version in class

        // calling static method from inherite
        C_interface.m2();            // Static method from C_interface
        C_interface.m2("Hello");     // Overloaded static method from C_interface
    }
}
