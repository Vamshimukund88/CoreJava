package polymorphism;

public class OverridingProtectedModifierParent {
    protected void m1()
    {
        System.out.println("parent m1 method");
    }
}
class OverridingProtectedModifierChild extends OverridingProtectedModifierParent
        {
            public void m1()
        {
            System.out.println("m1 child method");
        }
        public static void main(String[] args)
        {
            // // object is child class , so we get child method printed by overriding parent method.
        OverridingProtectedModifierChild OPC = new OverridingProtectedModifierChild();
        OPC.m1();
        // Here i want to print parent method, so i directly created parent object below, So parent method id printed
            OverridingProtectedModifierParent OPP = new OverridingProtectedModifierParent();
            OPP.m1();
        }
        }
