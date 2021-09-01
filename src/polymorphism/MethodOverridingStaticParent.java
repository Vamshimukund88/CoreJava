package polymorphism;
// Static method pverriding is not possible in JAVA
public class MethodOverridingStaticParent {
    static void m1()
    {
        System.out.println("Parent m1 method");
    }
}
class MethodOverridingStaticChild extends MethodOverridingStaticParent {
    static void m1() {
        System.out.println("child m1 method");
    }

    public static void main(String[] args) {
        MethodOverridingStaticParent P = new MethodOverridingStaticChild();
        P.m1();
    }
}
