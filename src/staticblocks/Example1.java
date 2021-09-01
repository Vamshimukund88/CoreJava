package staticblocks;
/*
This program has two Objects. Here, Instance blocks are executed for two different objects,
but the static blocks are executed only once during .CLASS creation.
 */
public class Example1 {
    static {
        System.out.println("Static block1");
    }
    {
        System.out.println("Instance block1");
    }
    {
        System.out.println("Instance block2");
    }
    static {
        System.out.println("Static block2");
    }
    Example1()
    {
        System.out.println("0 arg constructor");
    }
    Example1(int a)
    {
        System.out.println("1 arg constructor");
    }
    public static void main(String[] args)
    {
        new Example1();
        new Example1(10);
    }
}
/* output
Static block1
Static block2
Instance block1
Instance block2
0 arg constructor
Instance block1
Instance block2
1 arg constructor
 */
