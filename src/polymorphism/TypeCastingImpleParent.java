package polymorphism;
// Inorder to print m2 method in child class, type-casting should be implemented or else you will get compilation error
public class TypeCastingImpleParent {
    void m1()
    {
        System.out.println("parent m1 method");
    }
}
class TypeCastingImpleChild extends TypeCastingImpleParent
{
    void m1()
    {
        System.out.println("child class m1 method");
    }
    void m2()
    {
        System.out.println("child class m2 method");
    }
    public static void main(String[] args)
    {
        TypeCastingImpleParent p = new TypeCastingImpleChild();
        p.m1(); // Only this method can be printed using overriding concept
       // p.m2(); /*Error:(23, 10) java: cannot find symbol
                  //   symbol:   method m2()
                 //   location: variable p of type polymorphism.TypeCastingImpleParent */  To Overcome this issue , typecasting should be implemented
        TypeCastingImpleChild typecast = (TypeCastingImpleChild)p;
        typecast.m2();
    }
}
