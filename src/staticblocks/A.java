package staticblocks;

public class A {
    static
    {
        System.out.println("Static block Class A");
    }
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class.forName("B");
        Class.forName("C");
    }
}
