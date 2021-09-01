package abstraction;
// this program deals with creating constructor in abstact class .
abstract class Example4A {
    Example4A()// constructor in abstract class
    {
        System.out.println("abstract class constructor");
    }
    abstract void m1();

}
class Example4B extends Example4A
{
    void m1()
    {
        System.out.println(" implementation of m1 method ");
    }
    Example4B() // constructor in regular class
    {
        System.out.println("General method constructor");
    }
    public static void main(String[] args)
    {
        Example4B E4B = new Example4B();
        E4B.m1();
    }
}