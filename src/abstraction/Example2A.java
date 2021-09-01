package abstraction;
// Method implementation is done in crazy manner - Here: abstract methods are provided, then implementation is done in other methods
abstract class Example2A {
    abstract void m1();
    abstract void m2();
    abstract void m3();
    abstract void m4();
}
abstract class Example2B extends Example2A
{
    void m1()
    {
        System.out.println("m1 method implementation");
    }
}
abstract class Example2C extends Example2B
{
    void m2()
    {
        System.out.println("m2 method implementation");
    }
}
abstract class Example2D extends Example2C
{
    void m3()
    {
        System.out.println("m3 method implementation");
    }
}
   class Example2E extends Example2D
{
    void m4()
    {
        System.out.println("m4 method implementation");
    }
    public static void main(String[] args)
    {
        Example2E E2E = new Example2E();
        E2E.m4();
        E2E.m3();
        E2E.m2();
        E2E.m1();

    }
}


