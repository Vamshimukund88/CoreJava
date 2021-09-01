package polymorphism;

public class ConstructorOverloading {
    ConstructorOverloading()
    {
        System.out.println("0 arg constructor");
    }
    ConstructorOverloading(int a)
    {
        System.out.println("1 arg constructor");
    }
    ConstructorOverloading(int a, String name, char c)
    {
        System.out.println("3 arg constructor");
    }
    public static void main(String[] args)
    {
        new ConstructorOverloading();new ConstructorOverloading(10);new ConstructorOverloading(10,"NAME",'c');
    }
}
