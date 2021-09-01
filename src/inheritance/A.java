package inheritance;
// In this program, we are using super keyword to retrieve m2 method of parent class from child class.
// The same way this keyword helps on getting the parent class method to print in child class.
public class A {
    A()
    {
        System.out.println("Parent class o arg constructor");
    }
    void m1()
    {
        System.out.println("parent class m1 method");
    }
    void m2()
    {
        System.out.println("parent class m2 method");
    }
    }
    class B extends A
    {
        B()
        {
            this(10);
            System.out.println("Child class 0 arg constructor");
        }
        B(int a)
        {
            System.out.println("Child class 1 arg constructor");
        }
        void m1()
        {
            System.out.println("Child class m1 method");
            super.m2();

        }
        void m2() {
            System.out.println("child class m2 method");
        }
            public static void main(String[] args)
        {
                B b = new B();
                b.m1();

        }
        }


