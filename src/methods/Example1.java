package methods;
//
public class Example1 {
    void m1()
    {
        System.out.println("InstanceMethod");
    }
    static void m2()
    {
        System.out.println("StaticMethod");
    }
    public static void main(String[] args)
    {
        Example1 E1 = new Example1();
        E1.m1();
        Example1.m2();
    }
}
