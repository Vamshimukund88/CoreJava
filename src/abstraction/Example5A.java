package abstraction;
// Here Printing instance,static blocks in abstract class
abstract class Example5A {
    Example5A()
    {
        System.out.println("abstract class constructor");// constructor
    }
    {
        System.out.println("instance block in Abstract class");// isntance block
    }
    static
    {
        System.out.println("Static block in abstract clas"); // static block
    }
}
class Example5B extends Example5A
{
    Example5B()
    {
        super();
        System.out.println("normal class constructor");
    }
    public static void main(String[] args) {

        Example5B E5B = new Example5B();

    }
}
