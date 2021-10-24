package methods;
// Never ending loop
public class Example4 {
    void m1()
    {
        m3();
        m2();
        m1();
    }
    void m2()
    {
        System.out.println("M2 Method");
    }
    void m3()
    {
        System.out.println("M3 Method");
    }
    public static void main(String[] args)
    {
        Example4 E4 = new Example4();
        E4.m1();
    }
}
