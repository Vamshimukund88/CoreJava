package polymorphism;
// polymorphism example for "method overloading" -- it will have same method but with differnt parameters/argumets/datatypes
public class MethodOverloading {
    void m1()
    {
        System.out.println("m1method no arguments");
    }
    void m1(int a)
    {
        System.out.println("m1 method with 1 parameter as integer");
    }
    void m1(char c)
    {
        System.out.println("m1 method with 1 parameter as character");
    }
    void m1(int a,String name,char c)
    {
        System.out.println("m1 method with 3 different parameter");
    }
    public static void main(String[] args)
    {
        MethodOverloading mo = new MethodOverloading();
        mo.m1();
        mo.m1(10);
        mo.m1('a');
        mo.m1(10,"NAME",'a');
    }
}
