package inheritance;
/*
Inheritance example for Constructors
In this program, we are calling parent class constructor using "super" keyword , in child class constructor.
 */
public class Example3Parent {
    Example3Parent() {
        System.out.println(" Parent class 0 arg constructor");
    }
}
    class Example3Child extends Example3Parent
    {
        Example3Child()
        {
            super();
            System.out.println("Child class 0 arg constructor");
        }
        Example3Child(int a)
        {
            System.out.println("Child class 1 arg constructor");
        }
        public static void main(String args[])
        {
            new Example3Child(); new Example3Child(10);
        }

    }

