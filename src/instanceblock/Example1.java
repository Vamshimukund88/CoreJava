package instanceblock;
/*
In this program, we have constructor and instance block,
when ever an object is created Instance block is executed first
 then Constructor is executed*/
public class Example1 {
    Example1() // constructor
    {
        System.out.println("0 arg constructor");// o arg constructor
    }
    { // instance block
        System.out.println("Instance block");// instance block
    }
    public static void main(String[] args)
    {
        new Example1();// nameless object creation
    }
}
