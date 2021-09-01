package abstraction;
// Abstraction: Object cannot be created for Abstract class, It may or maynot contains abstract modifier for methods
// Abstrract class should be declared as ABSTRACT--- Ex: abstract class Test {  }
// abstract method ends with semicolon: ex: abstract void m1();---Method signature, It cannot be implemented

public abstract class Example1
{
 abstract void m1();
    abstract void m2();
    abstract void m3();
    void m4(){
        System.out.println("m4 method");
    }
}
class Example1Child extends Example1
{
   void m1(){
       System.out.println("m1 method");
   }
    void m2(){
        System.out.println("m2 method");
    }
    void m3(){
        System.out.println("m3 method");
    }

    public static void main(String[] args)
    {
        Example1 E1c = new Example1Child();
        /*
        Scenario 1: Parent p = new child();
        Scenario 2: Child c = new Child();
        Scenario 3:
         */
        E1c.m1();
        E1c.m2();
        E1c.m3();
        E1c.m4();
    }
}
