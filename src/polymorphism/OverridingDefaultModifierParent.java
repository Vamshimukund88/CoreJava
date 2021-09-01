package polymorphism;
// Default method Overriding
public class OverridingDefaultModifierParent
{
    void m1() // this is default modifier
    {
        System.out.println("Parent m1 method");
    }
}
class OverridingDefaultModifierChild extends OverridingDefaultModifierParent
 {
     void m1() // this is default modifier
     {
         System.out.println("child m1 method");
     }
 }
