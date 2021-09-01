package instanceblock;
/*
In this program,two constructors are created, but Object is created only once, So in this case,
instance block is called only once and only one constructor will be called.
Wheneve an object is created Instance block will be called first.
 */
public class Example2 {
    Example2()
    {
        System.out.println("0 Arg constructor");
    }
    Example2(int a)
    {
        System.out.println("1 arg constructor");
    }
    {
        System.out.println("Instance block1");
    }
    public static void main(String[] args)
    {
        Example2 E2 = new Example2(); // This object calls Example2() constructor
        Example2 E3 = new Example2(10);// This object calls Example2(int a) constructor
    }
}

