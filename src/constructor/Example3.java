package constructor;
//In this program, we are calling constructor with the help of another constructor.
// Using "THIS" keyword. Instead of creating mutiple objects for each different constructor.
public class Example3 {
    Example3()
    {
        this(10);
        System.out.println("0 Arg constructor");
    }
    Example3(int a)
    {
        this(20,32);
        System.out.println("1 Arg constructor");
    }
    Example3(int a, int b)
    {
        System.out.println("2 Arg constructor");
    }
    public static void main(String[] args)
    {
        Example3 E3 = new Example3();


    }
}
