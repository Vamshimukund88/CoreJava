package polymorphism;

public class CovariantOverridingParentExample {
    CovariantOverridingParentExample m1() // return type used is parent class name
    {
        System.out.println("Parent method m1");
        CovariantOverridingParentExample COP = new CovariantOverridingParentExample();
        return COP;
    }
}
class CovariantOverridingChildExample extends CovariantOverridingParentExample
{
    CovariantOverridingChildExample m1() // return type used is child class name
    {
        System.out.println(" Child m1 method");
        CovariantOverridingChildExample COC = new CovariantOverridingChildExample();
        return COC;
    }
    public static void main(String[] args)
    {
        CovariantOverridingChildExample COCobj = new CovariantOverridingChildExample();
        COCobj.m1();
    }
 }
