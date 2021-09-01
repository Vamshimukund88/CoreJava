package methods;

public class Example2 {

    void m1(int a,float b)
    {
        System.out.println("InstanceMethod");
        System.out.println(a);
        System.out.println(b);
    }
    static void m2(String str, boolean value)
    {
        System.out.println("StaticMethod");
        System.out.println(str);
        System.out.println(value);
    }
    public static void main(String[] args)
    {
        Example2 E2 = new Example2();
        E2.m1(10,8.0f);
        Example2.m2("Name", true);
    }
}

