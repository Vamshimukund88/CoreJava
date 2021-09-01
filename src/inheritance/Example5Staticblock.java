package inheritance;
// Example for "static block using Inheritance concept"
public class Example5Staticblock {
    static
    {
        System.out.println("Parent class static block");
    }
    {
        System.out.println("Parent class instance block ");
    }
}
class Example5Staticblockchildclass extends Example5Staticblock
{
    static
    {
        System.out.println("child class static block");
    }
    {
        System.out.println("child class instance block ");
    }
    public static void main(String[] args)
    {
        new Example5Staticblockchildclass();
    }
}
