package constructor;

public class Example1 {
    void m1()
    {
        System.out.println("Instance Method");
    }
    // 0-Argument constructor
    Example1()
    {
        System.out.println("O-Arg constructor");
    }
    // Parameterised constructor
    Example1(int a)
    {
        System.out.println("Argument Constructor");
    }
    public static void main(String[] args)
    {
        Example1 E1 = new Example1();// When object is created this will call default/0-arg constructor
        Example1 E2 = new Example1(10);// When object is created this will call Parameterised constructor-if we create any param. constructor as above  
        E1.m1();

    }
}
