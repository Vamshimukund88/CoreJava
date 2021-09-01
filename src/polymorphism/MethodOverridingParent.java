package polymorphism;
// Method Overriding example, In this child class method overrides parent class method
public class MethodOverridingParent
{
    void m1(){
        System.out.println("Parent m1method ");// This is overriden
    }
}
class MethodOverridingChild extends MethodOverridingParent
{
    void m1()
    {
        System.out.println("child m1 method");// This is overriding
    }
    public static void main(String[] args)
    {
        MethodOverridingChild MOC = new MethodOverridingChild();
        MOC.m1();
    }
}
