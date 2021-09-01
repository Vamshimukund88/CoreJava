package inheritance;
/*
printing parent class method using child class object
 */
public class Parent {
void m1()
{
    System.out.println("m1 method in parent class");
}
}
class child extends Parent
{
    static void m2()
    {
        System.out.println("m2 method");
    }
public static void main(String[] args)
{
    child c = new child();
    c.m1();
    child.m2();
}
}







