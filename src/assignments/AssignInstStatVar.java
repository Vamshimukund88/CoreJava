package assignments;
/*
Create 2 Instance variables
create 2 static variables
create instance method - print all the variables;
create static methood - print all the variables;
call these methods in main method
 */
public class AssignInstStatVar {
    int a = 10;
    int b = 20;
    static int x = 100;
    static int y = 200;
    public static void main(String[] args)
    {
        AssignInstStatVar AISmainmethod = new AssignInstStatVar();
        AISmainmethod.instancemethod();
        staticmethod();
    }
    public void instancemethod()
    {
        System.out.println("Printing instance variables in instance method : "+a);
        System.out.println("Printing instance variables in instance method : "+b);
        AssignInstStatVar AISInstMeth = new AssignInstStatVar();
        System.out.println("printing static variables in Instance method : "+AISInstMeth.x);
        System.out.println("printing static variables in Instance method : "+AISInstMeth.y);
    }
    public static void staticmethod()
    {
        AssignInstStatVar AISVstaticmeth = new AssignInstStatVar();
        System.out.println("Printing Instance variables in static method : " +AISVstaticmeth.a);
        System.out.println("Printing Instance variables in static method : "+AISVstaticmeth.b);
        System.out.println("Printing static variables in static method : " +AssignInstStatVar.x);
        System.out.println("Printing static variables in static method : "+AssignInstStatVar.y);
    }
}
