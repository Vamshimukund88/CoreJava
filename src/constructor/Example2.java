package constructor;

public class Example2
{
    int ID;
    String name;

    Example2(String name, int ID)
    {
        this.name=name;
        this.ID=ID;
    }
    void m1method()
    {
        System.out.println("Name is : " +name);
        System.out.println("ID is : "+ID);
    }

   public static void main(String[] args)
    {
        Example2 E1 = new Example2("Aarom",002);
        E1.m1method();
        Example2 E2 = new Example2("Smith",003);
        E2.m1method();
    }
}
